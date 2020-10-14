package warmup.prep;

import org.jdbi.v3.core.Jdbi;
import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.net.URI;
import java.net.URISyntaxException;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static java.lang.Integer.parseInt;
import static spark.Spark.*;

public class Main {

    static int getHerokuAssignedPort() {
        ProcessBuilder processBuilder = new ProcessBuilder();
        if (processBuilder.environment().get("PORT") != null) {
            return parseInt(processBuilder.environment().get("PORT"));
        }
        return 4568;
    }

    static Jdbi getJdbiDatabaseConnection(String defaultJdbcUrl) throws URISyntaxException, SQLException {
        ProcessBuilder processBuilder = new ProcessBuilder();
        String database_url = processBuilder.environment().get("DATABASE_URL");
        if (database_url != null) {
            URI uri = new URI(database_url);
            String[] hostParts = uri.getUserInfo().split(":");
            String username = hostParts[0];
            String password = hostParts[1];
            String host = uri.getHost();
            int port = uri.getPort();
            String path = uri.getPath();
            String url = String.format("jdbc:postgresql://%s:%s%s", host, port, path);
            return Jdbi.create(url, username, password);
        }
        return Jdbi.create(defaultJdbcUrl);
    }

    public static void main(String[] args) {
        try {

            staticFiles.location("/public");
            port(getHerokuAssignedPort());
            Jdbi jdbi = getJdbiDatabaseConnection("jdbc:postgresql://localhost/oca_prep_db?user=mike&password=mike123");


            QuestionService questionService = new Questions(new QuestionQueries(jdbi));

            get("/", (req, res) -> {
                Map<String, Object> map = new HashMap<>();
                return new ModelAndView(map, "index.handlebars");
            }, new HandlebarsTemplateEngine());

            get("/questions", (req, res) -> {
                Map<String, Object> map = new HashMap<>();

                List<Question> list = questionService.getQuestions();

                map.put("questions", list);

                return new ModelAndView(map, "questions.handlebars");
            }, new HandlebarsTemplateEngine());

            get("/notes", (req, res) -> {
                Map<String, Object> map = new HashMap<>();
                return new ModelAndView(map, "notes.handlebars");
            }, new HandlebarsTemplateEngine());

            get("/add/question", (req, res) -> {
                Map<String, Object> map = new HashMap<>();
                return new ModelAndView(map, "add_question.handlebars");
            }, new HandlebarsTemplateEngine());

            post("/add/question", (req, res) -> {

                System.out.println();
                String questionText = req.queryParams("question-text");
                String questionBody = req.queryParams("question-body");
                int correctAnswers = Integer.parseInt(req.queryParams("correct-answers"));
                boolean multipleAnswers = Boolean.parseBoolean(req.queryParams("multiple-answers"));

                String[] options = AppMethods.getQuestionOptionsFromForm(req.queryParams("option-one"), req.queryParams("option-two"), req.queryParams("option-three"), req.queryParams("option-four"), req.queryParams("option-five"), req.queryParams("option-six"));

                Question question = new Question();

                question.setQuestionText(questionText);
                question.setQuestionBody(questionBody);
                question.setMultipleAnswers(multipleAnswers);
                question.setCorrectAnswers(correctAnswers);
                question.setQuestionOptions(options);

                questionService.addQuestion(question);


                Map<String, Object> map = new HashMap<>();
                map.put("success", "Question added to Bank");
                map.put("added", true);
                return new ModelAndView(map, "add_question.handlebars");
            }, new HandlebarsTemplateEngine());

            get("/add/notes", (req, res) -> {
                Map<String, Object> map = new HashMap<>();
                return new ModelAndView(map, "add_notes.handlebars");
            }, new HandlebarsTemplateEngine());

        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}

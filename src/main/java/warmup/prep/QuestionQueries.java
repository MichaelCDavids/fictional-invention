package warmup.prep;

import org.jdbi.v3.core.Jdbi;

import java.sql.SQLException;
import java.util.List;

public class QuestionQueries {

    private Jdbi jdbi;

    public QuestionQueries(Jdbi jdbi) {
        this.jdbi = jdbi;
    }

    public List<Question> getQuestions() throws SQLException {
        jdbi.open();
        List<Question> result = jdbi.withHandle((h) -> h.createQuery("select question_id, question_text, question_body, correct_answers, question_options, multiple_answers from question_bank")
                .mapToBean(Question.class)
                .list()
        );
        return result;

    }

    public boolean addQuestion(Question question) {
        System.out.println(question);
        String query = "insert into question_bank (question_text, question_body, correct_answers, question_options, multiple_answers) values ('"+question.getQuestionText()+"', '"+question.getQuestionBody()+"',1,Array ['"+question.getQuestionOptions()[0]+"', '"+question.getQuestionOptions()[1]+"','"+question.getQuestionOptions()[2]+"'],'"+question.isMultipleAnswers()+"')";
        jdbi.useTransaction(handle -> handle.execute(query));
        return true;

    }
}

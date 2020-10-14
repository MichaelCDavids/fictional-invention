package warmup.prep;

import java.sql.SQLException;
import java.util.List;

public class Questions implements QuestionService {

    QuestionQueries questionQueries;

    public Questions(QuestionQueries questionQueries){
        this.questionQueries = questionQueries;
    }


    @Override
    public List<Question> getQuestions() throws SQLException {
       return this.questionQueries.getQuestions();
    }

    @Override
    public boolean addQuestion(Question question) throws SQLException {
        return this.questionQueries.addQuestion(question);
    }
}

package warmup.prep;

import java.sql.SQLException;
import java.util.List;

public interface QuestionService {
    List<Question> getQuestions() throws SQLException;
    boolean addQuestion(Question question) throws SQLException;
}

package warmup.prep;


public class Question {
    private int questionId;
    private String questionText;
    private String questionBody;
    private int correctAnswers;
    private String[] questionOptions;
    private boolean multipleAnswers;


    public int getQuestionId() {
        return this.questionId;
    }

    public void setQuestionId(int questionId) {
        this.questionId = questionId;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getQuestionBody() {
        return questionBody;
    }

    public void setQuestionBody(String questionBody) {
        this.questionBody = questionBody;
    }

    public int getCorrectAnswers() {
        return this.correctAnswers;
    }

    public void setCorrectAnswers(int correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public String[] getQuestionOptions() {
        return this.questionOptions;
    }

    public void setQuestionOptions(String[] questionOptions) {
        this.questionOptions = questionOptions;
    }

    public boolean isMultipleAnswers() {
        return multipleAnswers;
    }

    public void setMultipleAnswers(boolean multipleAnswers) {
        this.multipleAnswers = multipleAnswers;
    }
}

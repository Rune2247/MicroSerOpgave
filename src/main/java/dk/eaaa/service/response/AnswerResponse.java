package dk.eaaa.service.response;

import dk.eaaa.domain.Explanation;

public class AnswerResponse {

    private Explanation explanation;
    private boolean correctAnswer;

    public AnswerResponse(Explanation explanation, boolean correctAnswer) {
        this.explanation = explanation;
        this.correctAnswer = correctAnswer;
    }


    public void setExplanation(Explanation explanation) {
        this.explanation = explanation;
    }

    public void setCorrectAnswer(boolean correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Explanation getExplanation() {
        return explanation;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
}

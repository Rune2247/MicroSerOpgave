package dk.eaaa.resource.dto;

public class QuestionAnswerDTO {
    // denne metode skal modtage fra et post fra front end

    private int answerId;


    public QuestionAnswerDTO(int answerId) {
        this.answerId = answerId;
    }

    public int getAnswerId() {
        return answerId;
    }
}

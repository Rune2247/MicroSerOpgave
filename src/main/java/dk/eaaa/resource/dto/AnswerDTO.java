package dk.eaaa.resource.dto;

public class AnswerDTO {
   private final int id;
    private final String  answer;


public AnswerDTO(int id, String answer){
    this.id = id;
    this.answer = answer;
}

    public String getAnswer() {
        return answer;
    }

    public int getId() {
        return id;
    }
}

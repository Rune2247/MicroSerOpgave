package dk.eaaa.resource.dto;

import java.util.List;

public class QuestionDTO {
    private int id;
    private String category;
    private String field;
    private int points;
    private String question;
    private List<AnswerDTO> answers;

    public QuestionDTO(int id, String category, String field, int points,String question, List<AnswerDTO> answers){
        this.id = id;
        this.category = category;
        this.field = field;
        this.points = points;
        this.question = question;
        this.answers = answers;
    }

    public int getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }

    public String getField() {
        return field;
    }

    public int getPoints() {
        return points;
    }

    public String getQuestion() {
        return question;
    }

    public List<AnswerDTO> getAnswers() {
        return answers;
    }
}

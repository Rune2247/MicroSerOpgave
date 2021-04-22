package dk.eaaa.domain;

import java.util.ArrayList;
import java.util.List;

public class Question {
    private final int id;
    private String category;
    private String field;
    private int points;
    private String question;
    private List<Answer> answers;

    public Question(int id, String category, String field, int points, String question, List<Answer> answers){
this.id = id;
this.category = category;
this.field = field;
this.points = points;
this.question = question;
// måske vi skal lave en setter i stedet.
this.answers = answers;

    }

    public int getId() {
        return id;
    }

    public int getPoints() {
        return points;
    }

    public String getCategory() {
        return category;
    }

    public String getField() {
        return field;
    }

    public String getQuestion() {
        return question;
    }

    public List<Answer> getAnswers() {
        return answers;
    }
}

package dk.eaaa.repository;

import dk.eaaa.domain.Answer;
import dk.eaaa.domain.Explanation;
import dk.eaaa.domain.Question;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

@ApplicationScoped
public class Repository {
    private final List<Question> QuestionList = new ArrayList<>();
    private final  List<Explanation> ExplanationList = new ArrayList<>();
    private final  List<Answer> answerList = new ArrayList<>();


    public Repository() {
        //initStorage();
        List<Answer> answerList1 = new ArrayList<>();
        answerList1.add(new Answer(1, "10", false));
        answerList1.add(new Answer(2, "20", true));
        answerList1.add(new Answer(3, "15", false));
        answerList1.add(new Answer(4, "25", false));


        answerList.addAll(answerList1);

        Question q1 = new Question(1, "Math", "+ and -", 10, "What is 10+10", answerList1);


        QuestionList.add(q1);

        Explanation e1 = new Explanation("10 + 10 er 20","https://www.google.dk");

        ExplanationList.add(e1);


        List<Answer> answerList2 = new ArrayList<>();
        answerList2.add(new Answer(1, "1999", false));
        answerList2.add(new Answer(2, "1000", true));
        answerList2.add(new Answer(3, "1500", false));
        answerList2.add(new Answer(4, "2500", false));


        answerList.addAll(answerList2);

        Question q2 = new Question(2, "Math", "* and /", 10, "100 * 10", answerList2);


        QuestionList.add(q2);

        Explanation e2 = new Explanation("100 * 10","https://en.wikipedia.org/wiki/Elementary_mathematics");

        ExplanationList.add(e2);
    }


    public List<Question> getQuestionList() {
        return QuestionList;
    }

    public List<Explanation> getExplanationList() {
        return ExplanationList;
    }

    public List<Answer> getAnswerList() {
        return answerList;
    }
}

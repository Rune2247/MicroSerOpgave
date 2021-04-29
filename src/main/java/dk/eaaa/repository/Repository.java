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


        //-----------------------------------------------------------------------------------


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


        //-----------------------------------------------------------------------------------


        List<Answer> answerList3 = new ArrayList<>();
        answerList3.add(new Answer(1, "At least 3 Bar", false));
        answerList3.add(new Answer(2, "At least 5 Bar", false));
        answerList3.add(new Answer(3, "At least 7 Bar", false));
        answerList3.add(new Answer(4, "At least 9 Bar", true));


        answerList.addAll(answerList3);

        Question q3 = new Question(3, "Coffee", "Espresso", 10, "How many Bars of pressure is needed to brew Espresso?", answerList3);


        QuestionList.add(q3);

        Explanation e3 = new Explanation("At least 8 bar of pressure is needed to extract the coffee oil.","https://youtu.be/lFwJF-_SUr0");

        ExplanationList.add(e3);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList4 = new ArrayList<>();
        answerList4.add(new Answer(1, "1995", false));
        answerList4.add(new Answer(2, "1997", true));
        answerList4.add(new Answer(3, "1999", false));
        answerList4.add(new Answer(4, "2001", false));


        answerList.addAll(answerList4);

        Question q4 = new Question(4, "Anime", "Pokemon", 10, "When did the first episode of Pokemon air on TV?", answerList4);


        QuestionList.add(q4);

        Explanation e4 = new Explanation("The first episode of Pokemon aired on April 1st, 1997.","https://en.wikipedia.org/wiki/Pok%C3%A9mon,_I_Choose_You!");

        ExplanationList.add(e4);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList5 = new ArrayList<>();
        answerList5.add(new Answer(1, "1:2", true));
        answerList5.add(new Answer(2, "1:3", false));
        answerList5.add(new Answer(3, "1:4", false));
        answerList5.add(new Answer(4, "1:5", false));


        answerList.addAll(answerList5);

        Question q5 = new Question(5, "Kaffe", "Espresso", 10, "What's the best ratio of coffee to water, when brewing Espresso?", answerList5);


        QuestionList.add(q5);

        Explanation e5 = new Explanation("The best ratio is consindered to be 1:2","https://honestcoffeeguide.com/tools/coffee-to-water-ratio/");

        ExplanationList.add(e5);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList21 = new ArrayList<>();
        answerList21.add(new Answer(1, "The indigenous Aboriginals", false));
        answerList21.add(new Answer(2, "Invasive species, such as rabbits", false));
        answerList21.add(new Answer(3, "Against Emus, a large non-flying bird", true));
        answerList21.add(new Answer(4, "Their colonial master, Great Britain", false));

        answerList.addAll(answerList21);

        Question q21 = new Question(21, "History", "Australian History", 10, "In 1932-33 the Australian government declared war against [...], and lost!",  answerList21);

        QuestionList.add(q21);

        Explanation e21 = new Explanation("Emus destroyed fields and drank up precious water supplies in 'the outback', so the Australian government deployed WWI veterans to fight them.", "https://en.wikipedia.org/wiki/Emu_War");

        ExplanationList.add(e21);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList22 = new ArrayList<>();
        answerList22.add(new Answer(1, "In 1931, after the colonies gained a large autonomy (Commonwealth of Nations)", false));
        answerList22.add(new Answer(2, "In 1947, after India and Pakistan became independent", false));
        answerList22.add(new Answer(3, "In 1997, after the transfer of Hong Kong to China, and thereby lost almost all their colonies", false));
        answerList22.add(new Answer(4, "Never, the sun has yet to set on the Brtish Empire", true));

        answerList.addAll(answerList22);

        Question q22 = new Question(22, "History", "British History", 10, "When did the sun set on the British Empire?",  answerList22);

        QuestionList.add(q22);

        Explanation e22 = new Explanation("Great Britain still holds control of a few islands in the Indian and Pacific Ocean which means at least one place is always in the day time.", "https://what-if.xkcd.com/48/");

        ExplanationList.add(e22);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList23 = new ArrayList<>();
        answerList23.add(new Answer(1, "Scandinavia", false));
        answerList23.add(new Answer(2, "The Kalmar Union", true));
        answerList23.add(new Answer(3, "The North Sea Empire", false));
        answerList23.add(new Answer(4, "The Roskilde Union", false));

        answerList.addAll(answerList23);

        Question q23 = new Question(23, "History", "Scandinavian history", 10, "In 1397 Denmark, Norway, and Sweden became united under once monarch. What was the name of this new 'country'?",  answerList23);

        QuestionList.add(q23);

        Explanation e23 = new Explanation("The constitution for the union was written in the city of Kalmar in Sweden, hence the name: 'The Kalmar Union'.", "https://danmarkshistorien.dk/leksikon-og-kilder/vis/materiale/kalmarunionen-1397-1523/");

        ExplanationList.add(e23);


        //-----------------------------------------------------------------------------------


        List<Answer> answerList24 = new ArrayList<>();
        answerList24.add(new Answer(1, "The Moon landing, 1969 AD", true));
        answerList24.add(new Answer(2, "The fall of Constantinople, 1453 AD", false));
        answerList24.add(new Answer(3, "The first viking raid, 793 AD", false));
        answerList24.add(new Answer(4, "The death of Emperor Augustus, 14 AD", false));

        answerList.addAll(answerList24);

        Question q24 = new Question(24, "History", "Egyptian", 10, "Cleopatra was born in the year 69 BC. Between her birth and the completion of the Giza Pyramid, which event is about as far away from her birth in the scale of time?",  answerList24);

        QuestionList.add(q24);

        Explanation e24 = new Explanation("The Giza Pyramid was completed about 2500 years before Cleppatra was born, and the Moon Landing took place about 2000 years after. The pyramids were ancient!", "https://sservi.nasa.gov/articles/how-long-ago-was-it/");

        ExplanationList.add(e24);


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

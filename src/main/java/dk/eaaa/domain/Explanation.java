package dk.eaaa.domain;

public class Explanation {


    private String explanation;
    private String sourceUrl;

    public Explanation(String explanation, String sourceUrl) {
        this.explanation = explanation;
        this.sourceUrl = sourceUrl;
    }

    public String getExplanation() {
        return explanation;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

}


package dk.eaaa.service.response.request;

import dk.eaaa.domain.Id;

public class CreateAdvertisementRequest {

    private final String category;
    private final String type;
    private final String headline;
    private final String text;
    private final int price;
    private final Id userId;

    public CreateAdvertisementRequest(String category, String type, String headline, String text, int price, Id userId) {
        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.userId = userId;
    }

    public String getCategory() {
        return category;
    }

    public String getType() {
        return type;
    }

    public String getHeadline() {
        return headline;
    }

    public String getText() {
        return text;
    }

    public int getPrice() {
        return price;
    }

    public Id getUserFK() {
        return userId;
    }
}

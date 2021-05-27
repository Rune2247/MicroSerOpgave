package dk.eaaa.resource.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAdvertisementDTO {

    private final String category;
    private final String type;
    private final String headline;
    private final String text;
    private final int price;
    private final String user;

    @JsonCreator
    public CreateAdvertisementDTO(
            @JsonProperty("category") String category,
            @JsonProperty("type") String type,
            @JsonProperty("headline") String headline,
            @JsonProperty("text") String text,
            @JsonProperty("price") int price,
            @JsonProperty("user") String user
    ) {

        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.user = user;

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

    public String getUser() {
        return user;
    }


}

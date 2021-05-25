package dk.eaaa.resource.dto;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateAdvertisementDTO {
    private final String id;
    private final String category;
    private final String type;
    private final String headline;
    private final String text;
    private final String price;
    private final String userFK;
    private final String creationDate;

    @JsonCreator
    public CreateAdvertisementDTO(@JsonProperty("id") String id,
                                  @JsonProperty("category") String category,
                                  @JsonProperty("type") String type,
                                  @JsonProperty("headline") String headline,
                                  @JsonProperty("text") String text,
                                  @JsonProperty("price") String price,
                                  @JsonProperty("userFK") String userFK,
                                  @JsonProperty("creationDate") String creationDate) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.userFK = userFK;
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
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

    public String getPrice() {
        return price;
    }

    public String getUserFK() {
        return userFK;
    }

    public String getCreationDate() {
        return creationDate;
    }
}

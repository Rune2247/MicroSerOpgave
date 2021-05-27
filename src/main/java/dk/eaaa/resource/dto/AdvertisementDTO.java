package dk.eaaa.resource.dto;

import java.time.LocalDate;

public class AdvertisementDTO {
    String id;
    String category;
    String type;
    String headline;
    String text;
    int price;
    String user;
    LocalDate creationDate;

    public AdvertisementDTO(String id, String category, String type, String headline, String text, int price, String user, LocalDate creationDate) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.user = user;
        this.creationDate = creationDate;
    }

    public String getId() {
        return id;
    }

    public String getCategory() {
        return category;
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

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

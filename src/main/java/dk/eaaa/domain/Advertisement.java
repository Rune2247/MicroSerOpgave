package dk.eaaa.domain;


import java.time.LocalDate;

public class Advertisement {
    Id id;
    String category;
    String type;
    String headline;
    String text;
    String price;
    Id user;
    LocalDate creationDate;

    public Advertisement(Id id, String category, String type, String headline, String text, String price, Id user, LocalDate creationDate) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.user = user;
        this.creationDate = creationDate;
    }

    public Id getId() {
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

    public Id getUser() {
        return user;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

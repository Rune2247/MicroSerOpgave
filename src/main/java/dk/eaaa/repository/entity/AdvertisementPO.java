package dk.eaaa.repository.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@NamedQueries({
        @NamedQuery(name = "AdvertisementPO.findAll", query = "SELECT u FROM AdvertisementPO u")})
public class AdvertisementPO {
public static final String FIND_ALL = "AdvertisementPO.findAll";

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "VARCHAR(40)", nullable = false, updatable = false, unique = true)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "CATEGORY", columnDefinition = "VARCHAR(40)", nullable = false)
    private String category;
    @Column(name = "TYPE", columnDefinition = "VARCHAR(40)", nullable = false)
    private String type;
    @Column(name = "HEADLINE", columnDefinition = "VARCHAR(40)", nullable = false)
    private String headline;
    @Column(name = "TEXT", columnDefinition = "VARCHAR(1000)", nullable = false)
    private String text;
    @Column(name = "PRICE", columnDefinition = "int", nullable = false)
    private String price;
    @Column(name = "USER_FK", columnDefinition = "VARCHAR(40)", nullable = false)
    private String user_FK;
    @Column(name = "CREATION_DATE", columnDefinition = "Date", nullable = false)
    private LocalDate creationDate;

    public AdvertisementPO() {
        //JPA
    }

    public AdvertisementPO(UUID id, String category, String type, String headline, String text, String price, String user_FK, LocalDate creationDate) {
        this.id = id;
        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.user_FK = user_FK;
        this.creationDate = creationDate;
    }

    public static String getFindAll() {
        return FIND_ALL;
    }

    public UUID getId() {
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

    public String getUser_FK() {
        return user_FK;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

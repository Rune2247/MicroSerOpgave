package dk.eaaa.repository.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name ="ADVERTISEMENT")
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
    private int price;
    @ManyToOne()
    @JoinColumn(name = "USER_FK", referencedColumnName = "ID")
    private UserPO user;
    @Column(name = "CREATION_DATE", columnDefinition = "Date", nullable = false)
    private LocalDate creationDate;

    public AdvertisementPO() {
        //JPA
    }

    public AdvertisementPO(String category, String type, String headline, String text, int price, UserPO user) {

        this.category = category;
        this.type = type;
        this.headline = headline;
        this.text = text;
        this.price = price;
        this.user = user;
        this.creationDate = LocalDate.now();
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

    public int getPrice() {
        return price;
    }

    public UserPO getUser() {
        return user;
    }

    public LocalDate getCreationDate() {
        return creationDate;
    }
}

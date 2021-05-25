package dk.eaaa.repository.entity;

import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;


//this class returns one user
@Entity
@Table(name = "AD_USER")
@NamedQueries({
        @NamedQuery(name = "UserPO.findAll", query = "SELECT u FROM UserPO u")})
public class UserPO {
    public static final
    String FIND_ALL = "UserPO.findAll";

    @Id
    @GeneratedValue
    @Column(name = "Id", columnDefinition = "VARCHAR(40)", nullable = false, updatable = false, unique = true)
    @Type(type = "uuid-char")
    private UUID id;

    @Column(name = "FIRST_NAME", columnDefinition = "VARCHAR(30)", nullable = false)
    private String firstName;

    @Column(name = "LAST_NAME", columnDefinition = "VARCHAR(30)", nullable = false)
    private String lastName;

    @Column(name = "COMPANY_NAME", columnDefinition = "VARCHAR(40)", nullable = false)
    private String companyName;

    @Column(name = "PHONE_NUMBER", columnDefinition = "VARCHAR(20)", nullable = false)
    private String phoneNumber;
    @Column(name = "PHONE_CODE", columnDefinition = "VARCHAR(10)", nullable = false)
    private String phoneCode;

    @Column(name = "EMAIL", columnDefinition = "VARCHAR(100)", nullable = false)
    private String email;

    @Column(name = "CITY_FK", columnDefinition = "VARCHAR(4)", nullable = false)
    private String cityFK;
    @Column(name = "TYPE", columnDefinition = "VARCHAR(10)", nullable = false)
    private String type;

    @Column(name = "CREATION_DATE", columnDefinition = "TIMESTAMP", nullable = false)
    private LocalDate created;

    @OneToMany()
    private List<AdvertisementPO> advertisements;

    public UserPO() {
        // JPA
    }

    public UserPO(String firstName, String lastName, String companyName, String phoneNumber, String phoneCode, String email, String city_FK, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.cityFK = city_FK;
        this.type = type;
        this.created = LocalDate.now();

    }

    public List<AdvertisementPO> getAdvertisements() {
        return advertisements;
    }

    public UUID getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPhoneCode() {
        return phoneCode;
    }

    public String getEmail() {
        return email;
    }

    public String getCityFK() {
        return cityFK;
    }

    public String getType() {
        return type;
    }

    public LocalDate getCreated() {
        return created;
    }
}


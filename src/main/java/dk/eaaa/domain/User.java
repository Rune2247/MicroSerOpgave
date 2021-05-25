package dk.eaaa.domain;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class User {
    Id id;
    String firstName;
    String lastName;
    String companyName;
    String phoneNumber;
    String phoneCode;
    String email;
    String cityFK;
    String type;
    LocalDate created;

    public User(Id id,String firstName, String lastName , String companyName, String phoneNumber, String phoneCode, String email, String city_FK, String type, LocalDate created) {
        this.id = id;
        this.firstName =firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.cityFK = city_FK;
        this.type = type;
        this.created = created;

    }

    public Id getId() {
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

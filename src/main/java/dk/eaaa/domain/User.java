package dk.eaaa.domain;

import java.time.LocalDate;

public class User {
    Id id;
    String firstName;
    String lastName;
    String companyName;
    String phoneNumber;
    String phoneCode;
    String email;
    City city;
    String type;
    LocalDate created;

    public User(Id id, String firstName, String lastName, String companyName, String phoneNumber, String phoneCode, String email, City city, String type, LocalDate created) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.city = city;
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

    public City getCity() {
        return city;
    }

    public String getType() {
        return type;
    }

    public LocalDate getCreated() {
        return created;
    }
}

package dk.eaaa.service.response.request;

import dk.eaaa.domain.Id;

import java.time.LocalDate;

public class CreateUserRequest {

    String firstName;
    String lastName;
    String companyName;
    String phoneNumber;
    String phoneCode;
    String email;
    String zipcode;
    String type;

    public CreateUserRequest(String firstName, String lastName, String companyName, String phoneNumber, String phoneCode, String email, String zipcode, String type) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.zipcode = zipcode;
        this.type = type;
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

    public String getZipcode() {
        return zipcode;
    }

    public String getType() {
        return type;
    }
}

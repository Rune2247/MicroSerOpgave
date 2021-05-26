package dk.eaaa.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class CreateUserDTO {
    private final String firstName;
    private final String lastName;
    private final  String companyName;
    private final  String phoneNumber;
    private final  String phoneCode;
    private final  String email;
    private final   String zipcode;
    private final  String type;

    public CreateUserDTO(@JsonProperty("firstName")String firstName,
                         @JsonProperty("lastName") String lastName,
                         @JsonProperty("companyName")String companyName,
                         @JsonProperty("phoneNumber")String phoneNumber,
                         @JsonProperty("phoneCode")String phoneCode,
                         @JsonProperty("email")String email,
                         @JsonProperty("zipcode")String zipcode,
                         @JsonProperty("type")String type) {
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

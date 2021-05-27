package dk.eaaa.resource.dto;

public class UserDTO {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final String companyName;
    private final String phoneNumber;
    private final String phoneCode;
    private final String email;
    private final String zipCode;
    private final String city;
    private final String type;

    public UserDTO(String id, String firstName, String lastName, String companyName, String phoneNumber, String phoneCode, String email, String zipCode, String city, String type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.zipCode = zipCode;
        this.city = city;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getZipCode() {
        return zipCode;
    }

    public String getCity() {
        return city;
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


    public String getType() {
        return type;
    }
}

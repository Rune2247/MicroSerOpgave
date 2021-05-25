package dk.eaaa.resource.dto;

public class UserDTO {
    private final String id;
    private final String firstName;
    private final String lastName;
    private final  String companyName;
    private final  String phoneNumber;
    private final  String phoneCode;
    private final  String email;
    private final   String cityFK;
    private final  String type;

    public UserDTO(String id, String firstName, String lastName, String companyName, String phoneNumber, String phoneCode, String email, String cityFK, String type) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.companyName = companyName;
        this.phoneNumber = phoneNumber;
        this.phoneCode = phoneCode;
        this.email = email;
        this.cityFK = cityFK;
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
}

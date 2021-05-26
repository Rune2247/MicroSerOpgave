package dk.eaaa.domain;

public class City {
    private final String zipcode;
    private final String city;

    public City(String zipcode, String city) {
        this.zipcode = zipcode;
        this.city = city;
    }

    public String getZipcode() {
        return zipcode;
    }

    public String getCity() {
        return city;
    }
}

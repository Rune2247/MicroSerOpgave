package dk.eaaa.repository.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CITY")
public class CityPO {

    @Id
    @Column(name = "ZIP_CODE", columnDefinition = "CHAR(4)", updatable = false)
    private String zipCode;

    @Column(name = "CITY", columnDefinition = "VARCHAR(40)", nullable = false)
    private String city;

    public String getCity() {
        return city;
    }

    public String getZipcode() {
        return zipCode;
    }
}

package org.ogin.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers2 implements Serializable{
    private BigDecimal id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String gender;

    @NotNull
    private BigDecimal yearsOfBirth;

    private String maritalStatus;

    @NotNull
    private String streetAddress;

    @NotNull
    private String postalCode;

    @NotNull
    private String city;

    @NotNull
    private BigDecimal cityId;

    public Customers2() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public BigDecimal getYearsOfBirth() {
        return yearsOfBirth;
    }

    public void setYearsOfBirth(BigDecimal yearsOfBirth) {
        this.yearsOfBirth = yearsOfBirth;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public BigDecimal getCityId() {
        return cityId;
    }

    public void setCityId(BigDecimal cityId) {
        this.cityId = cityId;
    }
}

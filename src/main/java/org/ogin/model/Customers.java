package org.ogin.model;

import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.math.BigDecimal;
import java.sql.Date;

/**
 * Created by Jabrik on 08/11/2014.
 */
public class Customers implements Serializable{
    @NotNull
    private BigDecimal id;
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private char gender;
    @NotNull
    private BigDecimal yearOfBirth;

    private String maritalStatus;
    @NotNull
    private String streetAddress;
    @NotNull
    private String postalCode;
    @NotNull
    private String city;
    @NotNull
    private BigDecimal cityId;
    @NotNull
    private String stateProvince;
    @NotNull
    private BigDecimal stateProvinceId;
    @NotNull
    private BigDecimal countryId;
    @NotNull
    private String mainPhoneNumber;

    private String incomeLevel;
    private BigDecimal creditLimit;
    private String email;
    @NotNull
    private String total;
    @NotNull
    private BigDecimal totalId;

    private BigDecimal srcId;
    private Date effFrom;
    private Date effTo;
    private String valid;

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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public BigDecimal getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(BigDecimal yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
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

    public String getStateProvince() {
        return stateProvince;
    }

    public void setStateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
    }

    public BigDecimal getStateProvinceId() {
        return stateProvinceId;
    }

    public void setStateProvinceId(BigDecimal stateProvinceId) {
        this.stateProvinceId = stateProvinceId;
    }

    public BigDecimal getCountryId() {
        return countryId;
    }

    public void setCountryId(BigDecimal countryId) {
        this.countryId = countryId;
    }

    public String getMainPhoneNumber() {
        return mainPhoneNumber;
    }

    public void setMainPhoneNumber(String mainPhoneNumber) {
        this.mainPhoneNumber = mainPhoneNumber;
    }

    public String getIncomeLevel() {
        return incomeLevel;
    }

    public void setIncomeLevel(String incomeLevel) {
        this.incomeLevel = incomeLevel;
    }

    public BigDecimal getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(BigDecimal creditLimit) {
        this.creditLimit = creditLimit;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public BigDecimal getTotalId() {
        return totalId;
    }

    public void setTotalId(BigDecimal totalId) {
        this.totalId = totalId;
    }

    public BigDecimal getSrcId() {
        return srcId;
    }

    public void setSrcId(BigDecimal srcId) {
        this.srcId = srcId;
    }

    public Date getEffFrom() {
        return effFrom;
    }

    public void setEffFrom(Date effFrom) {
        this.effFrom = effFrom;
    }

    public Date getEffTo() {
        return effTo;
    }

    public void setEffTo(Date effTo) {
        this.effTo = effTo;
    }

    public String getValid() {
        return valid;
    }

    public void setValid(String valid) {
        this.valid = valid;
    }
}

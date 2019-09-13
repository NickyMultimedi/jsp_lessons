package be.multimedi.jsp;

import java.io.Serializable;
import java.util.Objects;

public class AddressBean implements Serializable {
    private String name;
    private String lastName;
    private String street;
    private int number;
    private String postalCode;
    private String district;
    private String country;
    private String telephone;
    private String email;

    public AddressBean() {
    }

    public AddressBean(String name, String lastName, String street, int number, String postalCode, String district, String country, String telephone, String email) {
        this.name = name;
        this.lastName = lastName;
        this.street = street;
        this.number = number;
        this.postalCode = postalCode;
        this.district = district;
        this.country = country;
        this.telephone = telephone;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AddressBean that = (AddressBean) o;
        return getNumber() == that.getNumber() &&
                Objects.equals(getName(), that.getName()) &&
                Objects.equals(getLastName(), that.getLastName()) &&
                Objects.equals(getStreet(), that.getStreet()) &&
                Objects.equals(getPostalCode(), that.getPostalCode()) &&
                Objects.equals(getDistrict(), that.getDistrict()) &&
                Objects.equals(getCountry(), that.getCountry()) &&
                Objects.equals(getTelephone(), that.getTelephone()) &&
                Objects.equals(getEmail(), that.getEmail());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getLastName(), getStreet(), getNumber(), getPostalCode(), getDistrict(), getCountry(), getTelephone(), getEmail());
    }

    @Override
    public String toString() {
        return "AddressBean{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", street='" + street + '\'' +
                ", number=" + number +
                ", postalCode='" + postalCode + '\'' +
                ", district='" + district + '\'' +
                ", country='" + country + '\'' +
                ", telephone='" + telephone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

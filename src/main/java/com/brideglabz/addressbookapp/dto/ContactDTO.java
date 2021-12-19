package com.brideglabz.addressbookapp.dto;
import javax.validation.Valid;
import javax.validation.constraints.Pattern;
public class ContactDTO {
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$")
    public String firstName;
    @Pattern(regexp = "^[A-Z]{1,}[a-zA-z\\s]{2,}$")
    public String lastName;
    public String address;
    public String state;
    public String city;
    @Pattern(regexp = "^[0-9]{3}\\s{0,1}[0-9]{3}$")
    public String zip;
    @Pattern(regexp = "^^[0-9]{2}?[\\s,-]{0,1}[7-9]{1}[0-9]{9}$")
    public String phone;

    public ContactDTO(String firstName, String lastName, String address, String state, String city, String zip,
            String phone) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.state = state;
        this.city = city;
        this.zip = zip;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "ContactDTO [First Name =" + firstName + ", Last Name =" + lastName + ", Address =" + address
                + ", State =" + state + ", City =" + city + ", Zip =" + zip + ", Phone =" + phone + "]";
    }

}

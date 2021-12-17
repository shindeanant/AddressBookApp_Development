package com.brideglabz.addressbookapp.dto;

    public class ContactDTO {
        public String firstName;
        public String lastName;
        public String address;
        public String state;
        public String city;
        public String zip;
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
    
        public String getAddress() {
            return address;
        }
    
        public void setAddress(String address) {
            this.address = address;
        }
    
        public String getState() {
            return state;
        }
    
        public void setState(String state) {
            this.state = state;
        }
    
        public String getCity() {
            return city;
        }
    
        public void setCity(String city) {
            this.city = city;
        }
    
        public String getZip() {
            return zip;
        }
    
        public void setZip(String zip) {
            this.zip = zip;
        }
    
        public String getPhone() {
            return phone;
        }
    
        public void setPhone(String phone) {
            this.phone = phone;
        }
    
    
}

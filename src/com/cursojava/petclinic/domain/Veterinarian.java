package com.cursojava.petclinic.domain;

/**
 * Created by academy on 3/11/16.
 */
public class Veterinarian {
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNumber;

    public Veterinarian(){
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }


}

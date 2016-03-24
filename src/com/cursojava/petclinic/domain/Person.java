package com.cursojava.petclinic.domain;

import com.cursojava.petclinic.enums.Gender;

/**
 * Created by onix on 3/23/16.
 */
public class Person {

    private String firstName;
    private String lastName;
    private String documentIdentifier;
    private String address;
    private String phoneNumber;
    private String cellPhone;
    private Gender gender;

    public Person() {
    }

    public Person(String firstName, String lastName, String documentIdentifier) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentIdentifier = documentIdentifier;
    }

    public Person(String firstName, String lastName, String documentIdentifier, String address, String phoneNumber, String cellPhone, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.documentIdentifier = documentIdentifier;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.cellPhone = cellPhone;
        this.gender = gender;
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

    public String getDocumentIdentifier() {
        return documentIdentifier;
    }

    public void setDocumentIdentifier(String documentIdentifier) {
        this.documentIdentifier = documentIdentifier;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(String cellPhone) {
        this.cellPhone = cellPhone;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    // Override de Object


    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Person) ) {
            return false;
        }

        Person p2 = (Person) obj;
        return this.firstName.equals(p2.getFirstName()) &&
                this.lastName.equals(p2.getLastName()) &&
                this.documentIdentifier.equals(p2.getDocumentIdentifier());
    }

    @Override
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}

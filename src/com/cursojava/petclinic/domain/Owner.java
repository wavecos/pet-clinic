package com.cursojava.petclinic.domain;

import com.cursojava.petclinic.enums.OwnerCity;

/**
 * Created by academy on 3/11/16.

 */
public class Owner {

    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String cellPhone;
    private OwnerCity city;
    //Relaciones
    private Pet[] pets;




    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    public String getFirstName() {

        return firstName;
    }

    public OwnerCity getCity() {
        return city;
    }

    public void setCity(OwnerCity city) {
        this.city = city;
    }
    public Pet[] getPets() {
        return pets;
    }

    public void setPets(Pet[] pets) {
        this.pets = pets;
    }
}

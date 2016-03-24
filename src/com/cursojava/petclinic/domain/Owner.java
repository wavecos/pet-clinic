package com.cursojava.petclinic.domain;

import com.cursojava.petclinic.enums.OwnerCity;

/**
 * Created by academy on 3/11/16.

 */
public class Owner extends Person {

    private OwnerCity city;

    public Owner() {

    }

    public Owner(String firstName, String lastName, String documentIdentifier) {
        super(firstName, lastName, documentIdentifier);
    }

    //Relaciones
    private Pet[] pets;

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

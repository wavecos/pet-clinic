package com.cursojava.petclinic.domain;

import com.cursojava.petclinic.enums.Breed;
import com.cursojava.petclinic.enums.HairColor;

/**
 * Created by Hortencia on 11/03/2016.
 */
public class Pet {
    private String namePet;
    private int age;
    private HairColor hairColor;
    private Breed breed;

    public String getNamePet() {
        return namePet;
    }

    public void setNamePet(String namePet) {
        this.namePet = namePet;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public HairColor getHairColor() {
        return hairColor;
    }

    public void setHairColor(HairColor hairColor) {
        this.hairColor = hairColor;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }
}

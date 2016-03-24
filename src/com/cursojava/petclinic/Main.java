package com.cursojava.petclinic;

import com.cursojava.petclinic.domain.Clinic;
import com.cursojava.petclinic.domain.Owner;
import com.cursojava.petclinic.domain.Person;

public class Main {

    public static void main(String[] args) {

        System.out.println("*** PET CLINIC ***");

        Clinic happyPet = new Clinic("Happy Pet");

        System.out.println(happyPet);

        Person hortencia = new Person();
        hortencia.setFirstName("Hortencia");
        hortencia.setLastName("Flores");

        System.out.println(hortencia);

        Owner rodrigo = new Owner("Rodrigo", "Amurrio", "5423112");

        rodrigo.setPhoneNumber("4456789");


        System.out.println(rodrigo);




    }
}

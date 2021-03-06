package com.cursojava.petclinic.domain;

import com.cursojava.petclinic.enums.Gender;

/**
 * Created by academy on 3/11/16.
 */
public class Veterinarian extends Person {

    // Relaciones
    private Clinic clinic;
    private Schedule[] schedules;

    public Veterinarian(){}

    public Veterinarian(String firstName, String lastName, String address, String phoneNumber) {
        super(firstName, lastName, "0");
        super.setAddress(address);
        super.setPhoneNumber(phoneNumber);
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }

    public Schedule[] getSchedules() {
        return schedules;
    }

    public void setSchedules(Schedule[] schedules) {
        this.schedules = schedules;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Veterinarian) ) {
            return false;
        }

        Veterinarian p2 = (Veterinarian) obj;
        return  super.equals(p2) &&
                this.clinic.equals(p2.getClinic()) &&
                this.schedules.equals(p2.getSchedules());
    }
}

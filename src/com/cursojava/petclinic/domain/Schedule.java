package com.cursojava.petclinic.domain;

import java.util.Date;

/**
 * Created by onix on 3/11/16.
 */
public class Schedule {

    private Date dateVisit;
    private Veterinarian veterinarianOnDuty;
    private Pet patient;
    private String medicalRoom ;
    //Relaciones


    public Schedule(Date dateVisit, Veterinarian veterinarianOnDuty, Pet patient, String medicalRoom) {
        this.dateVisit = dateVisit;
        this.veterinarianOnDuty = veterinarianOnDuty;
        this.patient = patient;
        this.medicalRoom = medicalRoom;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public void setVeterinarianOnDuty(Veterinarian veterinarianOnDuty) {
        this.veterinarianOnDuty = veterinarianOnDuty;
    }

    public void setPatient(Pet patient) {
        this.patient = patient;
    }

    public void setMedicalRoom(String medicalRoom) {
        this.medicalRoom = medicalRoom;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public Veterinarian getVeterinarianOnDuty() {
        return veterinarianOnDuty;
    }

    public Pet getPatient() {
        return patient;
    }

    public String getMedicalRoom() {
        return medicalRoom;
    }

}

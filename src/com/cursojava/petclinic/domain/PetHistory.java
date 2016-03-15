package com.cursojava.petclinic.domain;

import  java.util.Date;

/**
 * Created by onix on 3/11/16.
 */
public class PetHistory {

    private String historyCode;
    private Date dateVisit;
    private Veterinarian veterian;
    private Pet patient;
    private String diagnostic;
    private String medicalPrescription;
    private String observation;


    public String getHistoryCode() {
        return historyCode;
    }

    public void setHistoryCode(String historyCode) {
        this.historyCode = historyCode;
    }

    public Date getDateVisit() {
        return dateVisit;
    }

    public void setDateVisit(Date dateVisit) {
        this.dateVisit = dateVisit;
    }

    public Veterinarian getVeterian() {
        return veterian;
    }

    public void setVeterian(Veterinarian veterian) {
        this.veterian = veterian;
    }

    public Pet getPatient() {
        return patient;
    }

    public void setPatient(Pet patient) {
        this.patient = patient;
    }

    public String getDiagnostic() {
        return diagnostic;
    }

    public void setDiagnostic(String diagnostic) {
        this.diagnostic = diagnostic;
    }

    public String getMedicalPrescription() {
        return medicalPrescription;
    }

    public void setMedicalPrescription(String medicalPrescription) {
        this.medicalPrescription = medicalPrescription;
    }

    public String getObservation() {
        return observation;
    }

    public void setObservation(String observation) {
        this.observation = observation;
    }
}

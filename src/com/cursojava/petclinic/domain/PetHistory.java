package com.cursojava.petclinic.domain;

import  java.util.Date;

/**
 * Created by onix on 3/11/16.
 */
public class PetHistory {

    private String historyCode;
    private Date dateVisit;
    private Veterinarian veterinarian;
    private Pet patient;
    private String diagnostic;
    private String medicalPrescription;
    private String observation;

    public PetHistory () {}

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

    public Veterinarian getVeterinarian() {
        return veterinarian;
    }

    public void setVeterinarian(Veterinarian veterinarian) {
        this.veterinarian = veterinarian;
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


    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof PetHistory) ) {
            return false;
        }

        PetHistory p2 = (PetHistory) obj;
        return this.historyCode.equals(p2.getHistoryCode()) &&
                this.dateVisit.equals(p2.getDateVisit()) &&
                this.patient.equals(p2.getPatient()) &&
                this.veterinarian.equals(p2.getVeterinarian());
    }
}

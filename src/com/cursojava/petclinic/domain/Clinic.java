package com.cursojava.petclinic.domain;

/**
 * Created by onix on 3/11/16.
 */
final public class Clinic {

    private String name;
    private String nit;
    private int numberRoom;
    private String address;
    // Relaciones
    private Veterinarian[] veterinarians;

    public Clinic() {
    }

    public Clinic(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    public int getNumberRoom() {
        return numberRoom;
    }

    public void setNumberRoom(int numberRoom) {
        this.numberRoom = numberRoom;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Veterinarian[] getVeterinarians() {
        return veterinarians;
    }

    public void setVeterinarians(Veterinarian[] veterinarians) {
        this.veterinarians = veterinarians;
    }

    @Override
    public boolean equals(Object obj) {
        if ( !(obj instanceof Clinic) ) {
            return false;
        }

        Clinic p2 = (Clinic) obj;
        return this.name.equals(p2.getName()) &&
                this.nit.equals(p2.getNit());
    }
}

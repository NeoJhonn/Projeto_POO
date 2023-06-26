package Entities;

import Interfaces.Crud;

import java.sql.Timestamp;
import java.util.Date;

public class Customer extends Person implements Crud {
    private String address;
    private String notes;

    public Customer() {

    }

    public Customer(int id, String nome, char gender, String phoneNumber, Date birthDate, int cpf, String rg,
                    boolean isActive, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy,
                    String address, String notes) {
        super(id, nome, gender, phoneNumber, birthDate, cpf, rg, isActive, createdAt, updatedAt, createdBy, updateBy);
        this.address = address;
        this.notes = notes;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }
}

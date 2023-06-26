package Entities;
import Enumerators.*;
import Interfaces.Crud;

import java.sql.Timestamp;
import java.util.*;

public class Employee extends Person implements Crud {
    private IMaritalStatus maritalStatus;
    private IEducationLevel educationLevel;
    private IRole role;
    private String workPermitNumber;
    private Date admissionDate;
    private Date firedDate;
    private boolean isAvailable;

    public Employee() {

    }

    public Employee(int id, String nome, char gender, String phoneNumber, Date birthDate, int cpf, String rg,
                    boolean isActive, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy,
                    String workPermitNumber, Date admissionDate, Date firedDate, boolean isAvailable) {
        super(id, nome, gender, phoneNumber, birthDate, cpf, rg, isActive, createdAt, updatedAt, createdBy, updateBy);
        this.workPermitNumber = workPermitNumber;
        this.admissionDate = admissionDate;
        this.firedDate = firedDate;
        this.isAvailable = isAvailable;
    }

    public String getWorkPermitNumber() {
        return workPermitNumber;
    }

    public void setWorkPermitNumber(String workPermitNumber) {
        this.workPermitNumber = workPermitNumber;
    }

    public Date getAdmissionDate() {
        return admissionDate;
    }

    public void setAdmissionDate(Date admissionDate) {
        this.admissionDate = admissionDate;
    }

    public Date getFiredDate() {
        return firedDate;
    }

    public void setFiredDate(Date firedDate) {
        this.firedDate = firedDate;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public IMaritalStatus getMaritalStatus() {
        return maritalStatus;
    }

    public IEducationLevel getEducationLevel() {
        return educationLevel;
    }

    public IRole getRole() {
        return role;
    }
}

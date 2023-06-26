package Entities;

import Interfaces.Crud;

import java.sql.Timestamp;
import java.util.*;

public class Menu implements Crud {
    private int  id;
    private String name;
    private List<Product> menuProductsList;
    private String code;
    private boolean isActive;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Employee createdBy;
    private Employee updateBy;

    public Menu() {

    }

    public Menu(int id, String name, List<Product> menuProductsList, String code, boolean isActive, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy) {
        this.id = id;
        this.name = name;
        this.menuProductsList = menuProductsList;
        this.code = code;
        this.isActive = isActive;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.createdBy = createdBy;
        this.updateBy = updateBy;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Employee getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Employee createdBy) {
        this.createdBy = createdBy;
    }

    public Employee getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Employee updateBy) {
        this.updateBy = updateBy;
    }

    public List<Product> getMenuProductsList() {
        return menuProductsList;
    }

    public void addProduct(Product p) {
        this.menuProductsList.add(p);
    }

    public void deleteProduct(int id) {
        this.menuProductsList.remove(id);
    }
}

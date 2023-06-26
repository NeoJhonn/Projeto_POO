package Entities;

import Enumerators.TableStatus;
import Interfaces.Crud;

import java.sql.Timestamp;
import java.util.*;

public class Table implements Crud {
    private int id;
    private Employee employee;
    private String name;
    private List<Customer> customerList;
    private int maxCapacity;
    private String code;
    private int number;
    private TableStatus tableStatus;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Employee createdBy;
    private Employee updateBy;

    public Table() {

    }

    public Table(int id, Employee employee, String name, List<Customer> customerList, int maxCapacity, String code, int number, TableStatus tableStatus, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy) {
        this.id = id;
        this.employee = employee;
        this.name = name;
        this.customerList = customerList;
        this.maxCapacity = maxCapacity;
        this.code = code;
        this.number = number;
        this.tableStatus = tableStatus;
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

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public TableStatus getTableStatus() {
        return tableStatus;
    }

    public void setTableStatus(TableStatus tableStatus) {
        this.tableStatus = tableStatus;
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

    public List<Customer> getCustomerList() {
        return customerList;
    }

    public void addCustomer(Customer c) {
        this.customerList.add(c);
    }

    public void deleteCustomer(int id) {
        this.customerList.remove(id);
    }

    public boolean isAvailable() {
        if (tableStatus == TableStatus.Disponivel) {
            return true;
        }
        return false;
    }

    public boolean hasOpenedOrders() {
        return false;
    }

    public boolean isAtMaxCapacity() {
        if (maxCapacity > this.customerList.size()) {
            return true;
        }
        return false;
    }
}

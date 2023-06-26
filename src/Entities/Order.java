package Entities;

import Enumerators.OrderStatus;
import Interfaces.Crud;

import java.sql.Timestamp;
import java.util.*;

public class Order implements Crud {
    private int id;
    private Table table;
    private Customer customer;
    private List<OrderItem> orderItemsList;
    private OrderStatus orderStatus;
    private  String code;
    private float totalPurchase;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Employee createdBy;
    private Employee updateBy;

    public Order() {

    }

    public Order(int id, Table table, Customer customer, List<OrderItem> orderItemsList, OrderStatus orderStatus, String code, float totalPurchase, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy) {
        this.id = id;
        this.table = table;
        this.customer = customer;
        this.orderItemsList = orderItemsList;
        this.orderStatus = orderStatus;
        this.code = code;
        this.totalPurchase = totalPurchase;
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

    public Table getTable() {
        return table;
    }

    public void setTable(Table table) {
        this.table = table;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public OrderStatus getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(OrderStatus orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public float getTotalPurchase() {
        return totalPurchase;
    }

    public void setTotalPurchase(float totalPurchase) {
        this.totalPurchase = totalPurchase;
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

    public List<OrderItem> getOrderItemsList() {
        return orderItemsList;
    }

    public void addOrderItem(OrderItem item) {
        this.orderItemsList.add(item);
    }

    public void deleteOrderItem(int id) {
        this.orderItemsList.remove(id);
    }

    public float closeOrder(float cash) {
        return 0;
    }

    public float apllyDiscount(float discount) {
        return this.totalPurchase * discount;
    }

    public float pay(float cash) {
        return 0;
    }

    public List<Order> findByStatus(OrderStatus status) {
        return null;
    }

    public List<Order> findByStatusAndTable(OrderStatus status, Table table) {
        return null;
    }

    public float calculateTotalPurchase() {
        return 0;
    }
}

package Entities;

import Enumerators.PreparationStatus;
import Interfaces.Crud;

import java.sql.Timestamp;

public class OrderItem implements Crud {
    private int id;
    private Product product;
    private int productAmount;
    private PreparationStatus preparationStatus;
    private Timestamp createdAt;
    private Timestamp updatedAt;
    private Employee createdBy;
    private Employee updateBy;

    public OrderItem() {

    }

    public OrderItem(int id, Product product, int productAmount, PreparationStatus preparationStatus, Timestamp createdAt, Timestamp updatedAt, Employee createdBy, Employee updateBy) {
        this.id = id;
        this.product = product;
        this.productAmount = productAmount;
        this.preparationStatus = preparationStatus;
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

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public int getProductAmount() {
        return productAmount;
    }

    public void setProductAmount(int productAmount) {
        this.productAmount = productAmount;
    }

    public PreparationStatus getPreparationStatus() {
        return preparationStatus;
    }

    public void setPreparationStatus(PreparationStatus preparationStatus) {
        this.preparationStatus = preparationStatus;
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
}

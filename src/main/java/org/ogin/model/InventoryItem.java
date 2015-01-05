package org.ogin.model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jabrik on 09/11/2014.
 */
public class InventoryItem {
    private BigDecimal id;
    private String description;
    private BigDecimal price;
    private BigDecimal onhand;
    private BigDecimal supplierId;
    private List<Supplier> suppliers = new ArrayList<Supplier>();

    public InventoryItem() {
    }

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public BigDecimal getOnhand() {
        return onhand;
    }

    public void setOnhand(BigDecimal onhand) {
        this.onhand = onhand;
    }

    public BigDecimal getSupplierId() {
        return supplierId;
    }

    public void setSupplierId(BigDecimal supplierId) {
        this.supplierId = supplierId;
    }

    public List<Supplier> getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(List<Supplier> suppliers) {
        this.suppliers = suppliers;
    }
}

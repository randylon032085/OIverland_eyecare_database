package com.dylan.view.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="sale_items")
public class SalesItem {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="sales_id",referencedColumnName="id")
    private Sales sales;

    @ManyToOne
    @JoinColumn(name="inventory_id", referencedColumnName="id")
    private Inventory inventory;

    @Column(name="quantity")
    private int quantity;

    @Column(name="price")
    private double price;

    
}

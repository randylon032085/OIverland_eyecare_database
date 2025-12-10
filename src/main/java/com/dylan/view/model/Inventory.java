package com.dylan.view.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="inventory")
public class Inventory {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private int id;

    @ManyToOne
    @JoinColumn(name="category_id", referencedColumnName="id")
    private Category category;

    @Column(name="item_name")
    private String itemName;

    @Column(name="brand")
    private String brand;

    @Column(name="cost_price")
    private double costPrice;

    @Column(name="selling_price")
    private double sellingPrice;

    @Column(name="stock")
    private int stock;

    @OneToMany(mappedBy="inventory")
    private List<SalesItem> salesItems;


}

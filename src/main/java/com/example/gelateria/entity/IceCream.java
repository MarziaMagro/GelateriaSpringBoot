package com.example.gelateria.entity;

import jakarta.persistence.*;

@Entity
public class IceCream {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Integer id;
//  @Convert(converter = TasteConverter.class)
    IceCreamTaste taste;
    Double price;
    Integer quantity;

    public IceCream() {
    }

    public IceCream(Integer id, IceCreamTaste taste, Double price, Integer quantity) {
        this.id = id;
        this.taste = taste;
        this.price = price;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public IceCreamTaste getTaste() {
        return taste;
    }

    public void setTaste(IceCreamTaste taste) {
        this.taste = taste;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
}

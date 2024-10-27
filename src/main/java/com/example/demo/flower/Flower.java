package com.example.demo.flower;

import com.example.demo.Item;

import lombok.Getter;
import lombok.Setter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Flower extends Item {
    private double sepalLength;
    private FlowerColor color;
    private Integer price;
    private FlowerType flowerType;

    public Flower(String name, double itemPrice, double sepalLength, FlowerColor color, Integer price, FlowerType flowerType) {
        super(name, itemPrice);
        this.sepalLength = sepalLength;
        this.color = color;
        this.price = price;
        this.flowerType = flowerType;
    }

    public Flower(Flower flower) {
        super(flower.getName(), flower.getPrice());
        this.flowerType = flower.flowerType;
        this.sepalLength = flower.sepalLength;
        this.price = flower.price;
        this.color = flower.color;
    }

    public String getColor() {
        return color.toString();
    }

    public boolean match(Flower f) {
        return this.price.equals(f.getPrice()) && this.flowerType.equals(f.getFlowerType())
                && this.sepalLength == f.getSepalLength();
    }
}

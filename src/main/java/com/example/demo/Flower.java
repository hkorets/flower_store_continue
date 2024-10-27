package com.example.demo;

public class Flower extends Item {

    public Flower(String type, String color) {
        super("item1", 10.0);
    }
    private String type;
    private String color;

    public String getType(){
        return this.type;
    }

    public void setType(String val) {
        this.type = val;
    }

    public String getColor(){
        return this.color;
    }

    public void setColor(String val) {
        this.color = val;
    }

}
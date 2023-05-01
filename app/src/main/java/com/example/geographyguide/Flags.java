package com.example.geographyguide;

public class Flags {
    // поля сущности
    private String name; // название страны
    private String description;
    private int resource;
    private String square;

    //конструктор
    public Flags(String name, String description, int resource, String square) {
        this.name = name;
        this.description = description;
        this.resource = resource;
        this.square = square;
    }

    // геттеры и сеттеры

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getResource() {
        return resource;
    }

    public void setResource(int resource) {
        this.resource = resource;
    }

    public String getSquare() {
        return square;
    }

    public void setSquare(String square) {
        this.square = square;
    }
}

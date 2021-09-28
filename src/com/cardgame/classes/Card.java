package com.cardgame.classes;

public abstract class Card {
    private String id;
    private String name;
    private String element;
    private String description;
    private int power;

    public Card(String id, String name, String element, String description, int power) {
        this.id = id;
        this.name = name;
        this.element = element;
        this.description = description;
        this.power = power;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public String getDescription() {
        return description;
    }

    public int getPower() {
        return power;
    }
}

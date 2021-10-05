package com.cardgame.classes;

public class MonsterCard extends Card{
    private String race;

    public MonsterCard(String name, String element, String description, int power, String race) {
        super(name, element, description, power);
        this.race = race;
    }
}

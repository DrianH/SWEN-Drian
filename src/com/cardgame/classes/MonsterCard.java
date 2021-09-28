package com.cardgame.classes;

public class MonsterCard extends Card{
    private String race;

    public MonsterCard(String id, String name, String element, String description, int power, String race) {
        super(id, name, element, description, power);
        this.race = race;
    }
}

package com.cardgame;

import com.cardgame.classes.*;

import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

public class CardGameMain {
    public static void main(String[] args){
        Card card1 = new MonsterCard("Balrog", "Fire", "He will pass.", 30, "Demon");
        Card card2 = new MonsterCard("Hydra", "Water", "The depths always listen.", 25, "Great Serpent");
        Card card3 = new MonsterCard("Zephyr Dragon", "Air", "Skies sing of it's wings", 20, "Dragon");
        Card card4 = new MonsterCard("Gladiator", "Earth", "Are you not entertained?!", 15, "Human");
        Card card5 = new SpellCard("Combustion", "Fire", "Blaze be upon you!", 20);
        Card card6 = new SpellCard("Torrent", "Water", "Water always flows.", 15);
        Card card7 = new SpellCard("Wind Blades", "Air", "The gale cuts sharper than the blade", 15);
        Card card8 = new SpellCard("Earthquake", "Earth", "The earth crumbles.", 30);

        ArrayList<Card> cards = new ArrayList<>();
        cards.add(card1);
        cards.add(card2);
        cards.add(card3);
        cards.add(card4);
        cards.add(card5);
        cards.add(card6);
        cards.add(card7);
        cards.add(card8);

        User user1 = new User("JohnDoe123", "password1");
        User user2 = new User("MartinNoman1234", "password2");

        for(int i = 0; i < 4; i++){
            int rand = new Random().nextInt(cards.size());
            user1.getDeck().add(cards.get(rand));
            cards.remove(rand);
        }

        for(int i = 0; i < 4; i++){
            int rand = new Random().nextInt(cards.size());
            user2.getDeck().add(cards.get(rand));
            cards.remove(rand);
        }

        new Battle(new User[]{user1, user2}).begin();
    }
}

package com.company;

public class Billy extends Unit {
    private int armor;

    public Billy(String name, int health, int dmg, String weapon, int gold, int armor) {
        super(name, health, dmg, weapon, gold);
        this.armor = armor;
    }
}

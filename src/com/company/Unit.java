package com.company;

public abstract class Unit {
    public String getName() {
        return name;
    }

    private String name;
    private int health;
    private int dmg;
    private String weapon;
    private int gold;
    public Unit(String name, int health, int dmg, String weapon, int gold) {
        this.name = name;
        this.health = health;
        this.dmg = dmg;
        this.weapon = weapon;
        this.gold = gold;
    }
    public void stats(){
        System.out.println("Name: "+name+"health: "+health+"dmg: "+dmg+"gold: "+gold);
    }
    public int getDmg() {
        return dmg;
    }
    public void setDmg(int dmg) {
        this.dmg = dmg;
    }
    public int getGold() {
        return gold;
    }

    public void setGold(int gold) {
        this.gold = gold;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }



}

package com.company;

public class Boss {
    private int health;
    private int damage;
    private String bossDefense;

    public Boss(int health, String bossDefense){
        this.health  = health;
        this.damage = damage;
        this.bossDefense = bossDefense;
    }


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getBossDefense() {
        return bossDefense;
    }

    public void setBossDefense(String bossDefense) {
        this.bossDefense = bossDefense;
    }
}
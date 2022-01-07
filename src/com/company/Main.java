package com.company;

public class Main {

    public static void main (String[] args ){
        Boss boss = new Boss (500,"defenses");
        System.out.println(" Boss.health " +  boss.getHealth() + " " + boss.getDamage() + " " + boss.getBossDefense ());
    }
}
package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss("Tanos" , 1000 , 60 , 100 );
        Hero1 hero1 = new Hero1("Warrior" , 200 , 60 , 100);
        Hero2 hero2 = new Hero2("Magical" , 150 , 80 , 60);
        Hero3 hero3 = new Hero3("Mental" , 120 , 50 , 200);
        System.out.println(boss.getName() + " : " + "Hp: " + boss.getHp() + ", " + "Damage: " + boss.getDamage() + ", " + "SuperHit: " + boss.getSuperHit() + ";");
        System.out.println("__________________________________");
        System.out.println(hero1.getName() + " : " + "Hp: " + hero1.getHp() + ", " + "Damage: " + hero1.getDamage() + ", " + "AttackType: " + hero1.getAttackType() + ";");
        System.out.println("__________________________________");
        System.out.println(hero2.getName() + " : " + " Hp: " + hero2.getHp() + ", "+ "Damage: " + hero2.getDamage() + ", " + "ExtraLive: " + hero2.getExtraLive() + ";");
        System.out.println("__________________________________");
        System.out.println(hero3.getName() + " : " + "Hp: " + hero3.getHp() + ", "+ "Damage: " + hero3.getDamage() + ", " + "CriticalDamage: " + hero3.getCriticalDamage() + ";");


    }
}

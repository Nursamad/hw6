package com.company;

public class Base {
    String name;
    int  hp;
    int damage;

    public Base(String name, int hp, int damage) {
        this.name = name;
        this.hp = hp;
        this.damage = damage;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}



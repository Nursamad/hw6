package com.company;

public class Hero3 extends Base{
    int criticalDamage;

    public Hero3(String name, int hp, int damage, int criticalDamage) {
        super(name, hp, damage);
        this.criticalDamage = criticalDamage;
    }

    public int getCriticalDamage() {
        return criticalDamage;
    }


}
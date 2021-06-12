package com.company;

public class Hero1  extends Base{
int attackType;

    public Hero1(String name, int hp, int damage, int attackType) {
        super(name, hp, damage);
        this.attackType = attackType;
    }

    public int getAttackType() {
        return attackType;
    }

    public void setAttackType(int attackType) {
        this.attackType = attackType;
    }
}

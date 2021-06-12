package com.company;

public class Hero2 extends Base{
    int extraLive;

    public Hero2(String name, int hp, int damage, int extraLive) {
        super(name, hp, damage);
        this.extraLive = extraLive;
    }

    public int getExtraLive() {
        return extraLive;
    }

    public void setExtraLive(int extraLive) {
        this.extraLive = extraLive;
    }
}

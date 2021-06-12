package com.company;

public class Boss extends Base {
    int superHit;

    public Boss(String name, int hp, int damage, int superHit) {
        super(name, hp, damage);
        this.superHit = superHit;
    }

    public int getSuperHit() {
        return superHit;
    }

    public void setSuperHit(int superHit) {
        this.superHit = superHit;
    }
}
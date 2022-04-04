package org.example;

public class Weapon {
    private int durability;
    private String name;
    private boolean isDisable;
    private int hitDamage;

    public Weapon(String namme, int i, int i1) {
        this.name = namme;
        this.hitDamage = i;
        this.durability = i1;
    }

    public int getDurability() {
        return durability;
    }

    public String getName() {
        return name;
    }

    public boolean isDisable() {
        return isDisable;
    }

    public int getHitDamage() {
        return hitDamage;
    }
}

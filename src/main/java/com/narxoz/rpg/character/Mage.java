package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public class Mage implements Character{
    
    private String name;
    private int health;
    private int mana;
    private int strength;
    private int intelligence;
    private Weapon weapon;
    private Armor armor;

    public Mage(String name) {
        this.name = name;
        this.health = 70;
        this.mana = 150;
        this.strength = 8;
        this.intelligence = 30;
    }

    @Override
    public void getStats() {
        System.out.println("=== Mage Stats ===");
        System.out.println("Name: " + name);
        System.out.println("Health: " + health);
        System.out.println("Mana: " + mana);
        System.out.println("Strength: " + strength);
        System.out.println("Intelligence: " + intelligence);
    }

    @Override
    public void useSpecialAbility() {
        System.out.println(name + " casts Fireball! Massive magic damage!");
    }

    @Override
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    @Override
    public void equipArmor(Armor armor) {
        this.armor = armor;
    }

    @Override
    public void showEquipment() {
        if (weapon != null) weapon.showWeapon();
        if (armor != null) armor.showArmor();
    }
}

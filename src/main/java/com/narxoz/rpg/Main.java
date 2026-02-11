package com.narxoz.rpg;

import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;


public class Main {
    public static void main(String[] args) {
        Character warrior = new Warrior("Thorin");
        warrior.getStats();
        warrior.useSpecialAbility();

        System.out.println();

        Character mage = new Mage("Gandalf");
        mage.getStats();
        mage.useSpecialAbility();

        System.out.println();
        
        Character archer = new Archer("Legolas");
        archer.getStats();
        archer.useSpecialAbility();
    }
}

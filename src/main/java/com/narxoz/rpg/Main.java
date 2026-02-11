package com.narxoz.rpg;

import com.narxoz.rpg.character.Mage;
import com.narxoz.rpg.character.Warrior;
import com.narxoz.rpg.factory.ArcherCreator;
import com.narxoz.rpg.factory.CharacterCreator;
import com.narxoz.rpg.factory.MageCreator;
import com.narxoz.rpg.factory.WarriorCreator;
import com.narxoz.rpg.character.Archer;
import com.narxoz.rpg.character.Character;


public class Main {
    public static void main(String[] args) {
        CharacterCreator warriorFactory = new WarriorCreator();
        Character warrior = warriorFactory.createCharacter("Thorin");

        warrior.getStats();
        warrior.useSpecialAbility();

        System.out.println();

        CharacterCreator mageFactory = new MageCreator();
        Character mage = mageFactory.createCharacter("Gandalf");

        mage.getStats();
        mage.useSpecialAbility();

        System.out.println();

        CharacterCreator archerFactory = new ArcherCreator();
        Character archer = archerFactory.createCharacter("Legolas");

        archer.getStats();
        archer.useSpecialAbility();
        
        /*System.out.println();

        Character mage = new Mage("Gandalf");
        mage.getStats();
        mage.useSpecialAbility();

        System.out.println();

        Character archer = new Archer("Legolas");
        archer.getStats();
        archer.useSpecialAbility(); */
    }
}

package com.narxoz.rpg;

import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.factory.ArcherCreator;
import com.narxoz.rpg.factory.CharacterCreator;
import com.narxoz.rpg.factory.EquipmentFactory;
import com.narxoz.rpg.factory.MageCreator;
import com.narxoz.rpg.factory.MedievalEquipmentFactory;
import com.narxoz.rpg.factory.WarriorCreator;



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
        
        System.out.println();

        System.out.println("=== Equipment ===");

        EquipmentFactory medievalFactory = new MedievalEquipmentFactory();

        Weapon weapon_warrior = medievalFactory.createWeapon();
        Armor armor_warrior = medievalFactory.createArmor();

        warrior.equipWeapon(weapon_warrior);
        warrior.equipArmor(armor_warrior);

        System.out.println("Warrior Equipment:");
        warrior.showEquipment();


        System.out.println("----");
        EquipmentFactory elvenFactory = new MedievalEquipmentFactory();

        Weapon weapon_archer=elvenFactory.createWeapon();
        Armor armor_archer=elvenFactory.createArmor();
        archer.equipWeapon(weapon_archer);
        archer.equipArmor(armor_archer);
        System.out.println("Archer Equipment:");
        archer.showEquipment();


        

        


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

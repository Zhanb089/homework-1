package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.medieval.MedievalArmor;
import com.narxoz.rpg.equipment.medieval.MedievalSword;

public class MedievalEquipmentFactory implements EquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new MedievalSword();
    }

    @Override
    public Armor createArmor() {
        return new MedievalArmor();
    }
}

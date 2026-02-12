package com.narxoz.rpg.factory;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;
import com.narxoz.rpg.equipment.elven.ElvenArmor;
import com.narxoz.rpg.equipment.elven.ElvenBow;

public class ElvenEquipmentFactory implements EquipmentFactory{
    @Override
    public Weapon createWeapon() {
        return new ElvenBow();
    }

    @Override
    public Armor createArmor() {
        return new ElvenArmor();
    }
}

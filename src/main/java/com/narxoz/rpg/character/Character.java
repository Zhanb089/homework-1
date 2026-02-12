package com.narxoz.rpg.character;

import com.narxoz.rpg.equipment.Armor;
import com.narxoz.rpg.equipment.Weapon;

public interface Character {

    void getStats();

    void useSpecialAbility();

    void equipWeapon(Weapon weapon);
    void equipArmor(Armor armor);
    void showEquipment();

}

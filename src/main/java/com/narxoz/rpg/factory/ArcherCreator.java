package com.narxoz.rpg.factory;


import com.narxoz.rpg.character.Character;
import com.narxoz.rpg.character.Archer;

public class ArcherCreator extends CharacterCreator{
    @Override
    public Character createCharacter(String name) {
        return new Archer(name);
    }

}

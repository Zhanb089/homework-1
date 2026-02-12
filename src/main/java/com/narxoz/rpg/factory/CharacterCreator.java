package com.narxoz.rpg.factory;

import com.narxoz.rpg.character.Character;

public abstract class CharacterCreator {
    public abstract Character createCharacter(String name);
}

package com.game.places;

import java.util.List;

import com.game.characters.ICharacter;

public class Place implements IPlace {

	private String name;
	private List<ICharacter> characters;

	public Place(String name, List<ICharacter> characters) {
		this.name = name;
		this.characters = characters;
	}

	@Override
	public String getPlace() {
		return name;
	}

	@Override
	public List<ICharacter> getCharacters() {
		return this.characters;
	}

}

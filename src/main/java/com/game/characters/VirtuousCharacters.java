package com.game.characters;

public enum VirtuousCharacters   {
	DAENERYS("Daenerys Targerian"), JOHN_SNOW("John Snow"), TYRION_LANNISTER("Tyrion Lanister"), ARYA_STARK(
			"Arya Stark"), BRAN_STARK("Bran Stark");

	private String name;

	VirtuousCharacters(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}
}

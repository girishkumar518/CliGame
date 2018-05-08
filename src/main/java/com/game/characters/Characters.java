package com.game.characters;

public enum Characters {
	MOUNTAIN("Mountain"), CERSEI("Cersei Lannister"), KHAL_DRAGO("Khal Drago"), RAMSAY_BOLTON("Ramsay Bolton"), JOFFREY(
			"Joffrey Baratheon"), WALDER_FREY("Walder Frey"), DEAD_ARMY("Dead Army Leader");

	private String name;

	Characters(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
 
package com.game.places;

public enum Places {

	NORTH("Kingdom of the North"), MOUNTAIN_VALE("Kingdom of the Mountain and the Vale"), ISLES_RIVERS(
			"Kingdom of the Isles and Rivers"), ROCK("Kingdom of the Rock"), STORMLANDS(
					"Kingdom of the Stormlands"), REACH("Kingdom of the Reach"), DORNE("Principality of Dorne");

	private String name;

	Places(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}

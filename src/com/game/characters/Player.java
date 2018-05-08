package com.game.characters;

import java.io.Serializable;

import com.game.cli.utils.Constants;
import com.game.places.Places;

public class Player implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5514867355559638715L;

	private String name;
	private int experience;
	private Places currentPlace;

	public Player(String name) {

		this.name = name;
		experience = 0;
		currentPlace = Constants.FIRST_PLACE;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

	public Places getCurrentPlace() {
		return currentPlace;
	}

	public void setCurrentPlace(Places currentPlace) {
		this.currentPlace = currentPlace;
	}

}

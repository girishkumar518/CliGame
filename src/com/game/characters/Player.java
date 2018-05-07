package com.game.characters;

import java.io.Serializable;

import com.game.places.IPlace;

public class Player implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 5514867355559638715L;
	
	
	private String name;
	private int experience;
	private IPlace currentPlace;

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

	public IPlace getCurrentPlace() {
		return currentPlace;
	}

	public void setCurrentPlace(IPlace currentPlace) {
		this.currentPlace = currentPlace;
	}

}

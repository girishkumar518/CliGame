package com.game.characters;

import java.util.HashMap;
import java.util.Map;

import com.game.cli.utils.Constants;

public class CharacterImpl implements ICharacter {

	private String name;
	private int experience;

	private Map<Characters, String> characters;
	// private Map<VirtuousCharacters, String> virtuousCharacters;

	public CharacterImpl() {
		loadCharcters();
	}

	@Override
	public void display() {

	}

	@Override
	public String getName() {
		return null;
	}

	public void loadCharcters() {
		this.characters = new HashMap<>();
		characters.put(Characters.CERSEI, Constants.CERSEI);
		characters.put(Characters.JOFFREY, Constants.JOFFREY);
		characters.put(Characters.KHAL_DRAGO, Constants.KHAL_DRAGO);
		characters.put(Characters.MOUNTAIN, Constants.MOUNTAIN);
		characters.put(Characters.RAMSAY_BOLTON, Constants.RAMSAY_BOLTON);
		characters.put(Characters.WALDER_FREY, Constants.WALDER_FREY);
		characters.put(Characters.DEAD_ARMY, Constants.DEAD_ARMY);
		
		
	}

}

package com.game.places;

import java.util.Map;
import java.util.TreeMap;

import com.game.characters.CharacterUtil;
import com.game.characters.Characters;

public class PlacesUtil {

	static Map<Places, Characters> map;

	CharacterUtil util;

	private static void loadPlaces() {

		map = new TreeMap<>();
		map.put(Places.DORNE, Characters.MOUNTAIN);
		map.put(Places.ISLES_RIVERS, Characters.MOUNTAIN);
		map.put(Places.MOUNTAIN_VALE, Characters.MOUNTAIN);
		map.put(Places.NORTH, Characters.MOUNTAIN);
		map.put(Places.REACH, Characters.MOUNTAIN);
		map.put(Places.ROCK, Characters.MOUNTAIN);
		map.put(Places.STORMLANDS, Characters.MOUNTAIN);

	}

	public static Places getNextPlace(Places place) {

		return null;
	}

	public static Characters getCharacter(Places place) {
		if (map == null)
			loadPlaces();

		return map.get(place);
	}

}

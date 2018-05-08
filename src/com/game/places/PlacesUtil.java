package com.game.places;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

import com.game.characters.Characters;

public class PlacesUtil {

	static Map<Places, Characters> map;

	private static void loadPlacesMap() {

		map = new LinkedHashMap<>();
		map.put(Places.DORNE, Characters.MOUNTAIN);
		map.put(Places.ISLES_RIVERS, Characters.MOUNTAIN);
		map.put(Places.MOUNTAIN_VALE, Characters.MOUNTAIN);
		map.put(Places.NORTH, Characters.MOUNTAIN);
		map.put(Places.REACH, Characters.MOUNTAIN);
		map.put(Places.ROCK, Characters.MOUNTAIN);
		map.put(Places.STORMLANDS, Characters.MOUNTAIN);

	}

	public static Places getNextPlace(Places place) {

		// System.out.println("G "+map.higherKey(place));
		// System.out.println("G "+map.lowerKey(place));
		boolean nextFlg = false;
		for (Places p : map.keySet()) {

			if (nextFlg) {
				place = p;
				nextFlg = false;
				break;
			}

			if (p.equals(place)) {
				nextFlg = true;
			}
		}

		return place;
	}

	public static Characters getCharacter(Places place) {
		if (map == null)
			loadPlacesMap();

		return map.get(place);
	}

}

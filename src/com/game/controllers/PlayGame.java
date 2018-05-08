package com.game.controllers;

import java.util.Arrays;

import com.game.characters.CharacterUtil;
import com.game.characters.Player;
import com.game.display.GameConsole;
import com.game.menus.IScreen;
import com.game.places.PlacesUtil;

public class PlayGame implements IGameController {

	@Override
	public String getName() {
		return "P - Play Game";
	}

	@Override
	public String getPlayerInput() {
		return "P";
	}

	@Override
	public IScreen performOperation(IScreen screen) {

		screen.setGameControls(Arrays.asList(new ExitGame(), new SaveGame(), new PlayGame(), new Fight()));

		Player player = screen.getPlayer();

		String fightMsg = "You are in " + player.getCurrentPlace().getName() + "\n" + "Fight with "
				+ PlacesUtil.getCharacter(player.getCurrentPlace()).getName() + "\n"
				+ CharacterUtil.getCharacter(PlacesUtil.getCharacter(player.getCurrentPlace()));

		GameConsole.getInstance().display(fightMsg);

		return screen;

	}

}

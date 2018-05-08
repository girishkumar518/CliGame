package com.game.controllers;

import java.util.Arrays;
import java.util.Random;

import com.game.characters.Player;
import com.game.display.GameConsole;
import com.game.menus.IScreen;
import com.game.places.PlacesUtil;

public class Fight implements IGameController {

	@Override
	public String getName() {
		return "F - Fight";
	}

	@Override
	public String getPlayerInput() {
		return "F";
	}

	@Override
	public IScreen performOperation(IScreen screen) {

		boolean won = (new Random()).nextBoolean();

		Player player = screen.getPlayer();

		StringBuffer sb = new StringBuffer();
		sb.append("Hello, " + player.getName() + "\n");
		sb.append("You fought with " + PlacesUtil.getCharacter(player.getCurrentPlace()).getName() + "\n");

		if (won) {
			player.setExperience(player.getExperience() + 10);
			player.setCurrentPlace(PlacesUtil.getNextPlace(player.getCurrentPlace()));
			sb.append("Congratulations you WON the FIGHT\n");
			sb.append("Your experience increased to 10 \n");
			sb.append("Your Current Experience is " + player.getExperience() + "\n");
			sb.append("Please select Fight to continue ");
		} else
			sb.append("Sorry you LOST the FIGHT, Select option Fight to rematch with "
					+ PlacesUtil.getCharacter(player.getCurrentPlace()).getName());

		screen.setGameControls(Arrays.asList(new ExitGame(), new SaveGame(), new Fight()));

		GameConsole.getInstance().display(sb.toString());

		return screen;

	}

}

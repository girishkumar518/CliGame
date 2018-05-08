package com.game.controllers;

import java.util.Arrays;

import com.game.characters.Player;
import com.game.display.GameConsole;
import com.game.menus.IScreen;

public class NewGame implements IGameController {

	private static final String dsiplayMsg = "Please Create NEW Character \n Please Enter the NAME of the Character ::";

	private static final String succMsg = "New Character Created Succesfully";

	@Override
	public IScreen performOperation(IScreen screen) {

		screen.setGameControls(Arrays.asList(new ExitGame(), new SaveGame(), new PlayGame()));
		screen.setHasNext(true);

		GameConsole.getInstance().display(dsiplayMsg);

		String playerName = GameConsole.getInstance().readInput();

		Player player = new Player(playerName);

		GameConsole.getInstance().display(succMsg);

		screen.setPlayer(player);

		return screen;

	}

	@Override
	public String getName() {
		return "N - New Game";
	}

	@Override
	public String getPlayerInput() {
		return "N";
	}

}

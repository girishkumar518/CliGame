package com.game.controllers;

import java.util.Arrays;

import com.game.display.GameConsole;
import com.game.menus.GameScreen;
import com.game.menus.IScreen;

public class NewGame implements IGameController {

	private static final String name = "N - New Game";

	private static final String dsiplayMsg = "Please Create NEW Character \n Please Enter the NAME of the Character ::";
	
	private static final String succMsg = "New Character Created Succesfully";

	@Override
	public IScreen performOperation() {

		IScreen screen = new GameScreen(Arrays.asList(new ExitGame()));
		screen.setHasNext(true);
		
		GameConsole.getInstance().display(dsiplayMsg);

		return null;

	}

	@Override
	public String getName() {
		return this.name;
	}

	@Override
	public String getPlayerInput() {
		return "N";
	}

}

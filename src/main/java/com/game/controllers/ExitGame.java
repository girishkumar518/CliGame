package com.game.controllers;

import com.game.cli.utils.Constants;
import com.game.display.GameConsole;
import com.game.menus.IScreen;

public class ExitGame implements IGameController {

	@Override
	public String getName() {
		return "E - Exit Game";
	}

	@Override
	public String getPlayerInput() {
		return "E";
	}

	@Override
	public IScreen performOperation(IScreen screen) {

		GameConsole.getInstance().display(Constants.THANK_YOU);

		System.exit(0);

		return screen;
	}

}

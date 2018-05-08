package com.game.controllers;

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
		// TODO Auto-generated method stub
		return null;
	}

}

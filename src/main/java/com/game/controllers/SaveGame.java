package com.game.controllers;

import com.game.menus.IScreen;

public class SaveGame implements IGameController {

	@Override
	public String getName() {
		return "S - Save Game";
	}

	@Override
	public String getPlayerInput() {
		// TODO Auto-generated method stub
		return "S";
	}

	@Override
	public IScreen performOperation(IScreen screen) {
		// TODO Auto-generated method stub
		return null;
	}

}

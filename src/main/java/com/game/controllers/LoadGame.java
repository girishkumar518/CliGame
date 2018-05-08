package com.game.controllers;

import com.game.menus.IScreen;

public class LoadGame implements IGameController {

	@Override
	public String getName() {
		return "L - Load Game";
	}

	@Override
	public String getPlayerInput() {
		return "L";
	}

	@Override
	public IScreen performOperation(IScreen screen) {
		// TODO Auto-generated method stub
		return null;
	}

}

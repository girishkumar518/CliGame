package com.game.controllers;

import java.util.List;

import com.game.menus.IScreen;

public class ExitGame implements IGameController {

	@Override
	public IScreen performOperation() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return "E - Exit Game";
	}

	@Override
	public String getPlayerInput() {
		return "E";
	}

}

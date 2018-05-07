package com.game.controllers;

import java.util.List;

public class PlayGame implements IGameController {

	@Override
	public List<IGameController> performOperation() {
		return null;
		// TODO Auto-generated method stub
		
	}

	@Override
	public String getName() {
		return "P - Play Game";
	}

	@Override
	public String getPlayerInput() {
		return "P";
	}

}

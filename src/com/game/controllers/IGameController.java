package com.game.controllers;

import com.game.menus.IScreen;

public interface IGameController {

	public IScreen performOperation(IScreen screen);

	public String getName();

	public String getPlayerInput();

}

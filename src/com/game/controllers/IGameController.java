package com.game.controllers;

import com.game.menus.IScreen;

public interface IGameController {

	public IScreen performOperation();

	public String getName();

	public String getPlayerInput();

}

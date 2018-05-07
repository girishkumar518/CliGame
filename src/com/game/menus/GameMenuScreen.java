package com.game.menus;

import java.util.List;

import com.game.controllers.IGameController;

public class GameMenuScreen implements IScreen {

	private List<IGameController> controlls;

	public GameMenuScreen(List<IGameController> controlls) {
		this.controlls = controlls;
	}

	@Override
	public List<IGameController> getGameControls() {
		return controlls;
	}

	@Override
	public boolean hasNextScreen() {
		return true;
	}

}

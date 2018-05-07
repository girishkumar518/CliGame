package com.game.menus;

import java.util.List;

import com.game.controllers.IGameController;

public class GameScreen implements IScreen {

	private boolean hasNext = false;

	private List<IGameController> controlls;

	public GameScreen(List<IGameController> controlls) {
		this.controlls = controlls;
	}

	@Override
	public boolean hasNextScreen() {
		return hasNext;
	}

	public void setHasNext(boolean hasNext) {
		this.hasNext = hasNext;
	}

	@Override
	public List<IGameController> getGameControls() {
		return controlls;
	}

}

package com.game.menus;

import java.util.List;

import com.game.characters.Player;
import com.game.controllers.IGameController;

public class GameScreen implements IScreen {

	private boolean hasNext = false;

	private List<IGameController> controlls;

	private Player player;

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

	@Override
	public void setPlayer(Player player) {

		this.player = player;

	}

	@Override
	public Player getPlayer() {
		return this.player;
	}

	@Override
	public void setGameControls(List<IGameController> gameControls) {
		this.controlls = gameControls;
	}

}

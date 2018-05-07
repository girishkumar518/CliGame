package com.game.menus;

import java.util.List;

import com.game.controllers.IGameController;

public interface IScreen {

	public boolean hasNextScreen();

	public List<IGameController> getGameControls();

	public void setHasNext(boolean hasNext);

}

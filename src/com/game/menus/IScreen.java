package com.game.menus;

import java.util.List;

import com.game.characters.Player;
import com.game.controllers.IGameController;

public interface IScreen {

	public boolean hasNextScreen();

	public List<IGameController> getGameControls();

	public void setGameControls(List<IGameController> gameControls);

	public void setHasNext(boolean hasNext);

	public void setPlayer(Player player);

	public Player getPlayer();

}

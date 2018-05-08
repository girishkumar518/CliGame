package com.game.display;

import java.util.List;

import com.game.controllers.IGameController;
import com.game.menus.IScreen;

public interface IDisplay {

	public void display(String content);

	public void displayGameControllers(List<IGameController> list);
	
	public void displayScreen(IScreen screen);

	/*
	 * MEthod read will input and validate against the current Game Controllers 
	 */
	public IGameController readInput(List<IGameController> list);

}

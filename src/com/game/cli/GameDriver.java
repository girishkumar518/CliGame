package com.game.cli;

import java.util.Arrays;

import com.game.cli.utils.Constants;
import com.game.controllers.ExitGame;
import com.game.controllers.IGameController;
import com.game.controllers.LoadGame;
import com.game.controllers.NewGame;
import com.game.display.GameConsole;
import com.game.display.IDisplay;
import com.game.menus.GameMenuScreen;
import com.game.menus.IScreen;

/*
 * THis is the game starter class 
 * 
 * first time it will display welcome message 
 * 
 * then display 
 */

public class GameDriver {

	IDisplay display;
	IScreen screen;

	public GameDriver(IDisplay display, IScreen screen) {
		this.display = display;
		this.screen = screen;
	}

	public static void main(String[] args) {

		GameDriver gameDriver = new GameDriver(GameConsole.getInstance(),
				new GameMenuScreen(Arrays.asList(new NewGame(), new LoadGame(), new ExitGame())));
		gameDriver.start();

	}

	private void start() {

		display.display(Constants.startupMsg);

		// while (screen.hasScreens()) {

		// display game controllers
		display.displayGameControllers(screen.getGameControls());

		IGameController controller = display.readInput(screen.getGameControls());

		controller.performOperation();

		// }

	}

}

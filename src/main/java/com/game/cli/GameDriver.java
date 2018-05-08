package com.game.cli;

import java.util.Arrays;

import com.game.cli.utils.Constants;
import com.game.controllers.ExitGame;
import com.game.controllers.IGameController;
import com.game.controllers.LoadGame;
import com.game.controllers.NewGame;
import com.game.display.GameConsole;
import com.game.display.IDisplay;
import com.game.menus.GameScreen;
import com.game.menus.IScreen;

/*
 * THis is the game starter class 
 * 
 * first time it will display welcome message 
 * 
 * then display 
 */

public class GameDriver {

	IDisplay display = GameConsole.getInstance();
	IScreen screen;

	public GameDriver(IScreen screen) {
		this.screen = screen;
		this.screen.setHasNext(true);
	}

	public static void main(String[] args) {

		GameDriver gameDriver = new GameDriver(
				new GameScreen(Arrays.asList(new NewGame(), new LoadGame(), new ExitGame())));
		gameDriver.start();

	}

	private void start() {

		display.display(Constants.startupMsg);

		while (screen.hasNextScreen()) {

			// display game controllers
			display.displayGameControllers(screen.getGameControls());

			IGameController controller = display.readInput(screen.getGameControls());

			screen = controller.performOperation(screen);

		}

	}

}

package com.game.controllers;

import java.io.IOException;
import java.util.Arrays;

import com.game.characters.Player;
import com.game.characters.SerializationUtil;
import com.game.display.GameConsole;
import com.game.menus.GameScreen;
import com.game.menus.IScreen;

public class LoadGame implements IGameController {

	@Override
	public String getName() {
		return "L - Load Game";
	}

	@Override
	public String getPlayerInput() {
		return "L";
	}

	@Override
	public IScreen performOperation(IScreen screen) {

		try {
			Player player = SerializationUtil.deserialize("game.ser");
			screen.setPlayer(player);
			screen.setGameControls(Arrays.asList(new PlayGame(), new ExitGame()));
			GameConsole.getInstance().display("Game loaded successfully\n" + "Welcome " + player.getName());

		} catch (ClassNotFoundException | IOException e) {

			GameConsole.getInstance().display("ERROR in Loading the Game");

			e.printStackTrace();
		}

		return screen;
	}

}

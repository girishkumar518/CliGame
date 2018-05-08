package com.game.controllers;

import java.io.IOException;

import com.game.characters.SerializationUtil;
import com.game.display.GameConsole;
import com.game.menus.IScreen;

public class SaveGame implements IGameController {

	private final static String MSG = "Game Successfully Saved";

	@Override
	public String getName() {
		return "S - Save Game";
	}

	@Override
	public String getPlayerInput() {
		return "S";
	}

	@Override
	public IScreen performOperation(IScreen screen) {

		try {
			SerializationUtil.serialize(screen.getPlayer(), "game.ser");
		} catch (IOException e) {
			e.printStackTrace();
			GameConsole.getInstance().display("ERROR in Saving the Game");
		}
		
		GameConsole.getInstance().display(MSG);
		
		return screen;

	}

}

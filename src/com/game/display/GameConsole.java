package com.game.display;

import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Logger;

import com.game.controllers.IGameController;
import com.game.exceptions.InvalidOptionException;
import com.game.menus.IScreen;

public class GameConsole implements IDisplay {

	private static final Logger LOG = Logger.getLogger(GameConsole.class.getName());

	private final PrintWriter writer;
	private final Scanner scanner;

	private static GameConsole console;

	private GameConsole() {

		writer = new PrintWriter(new OutputStreamWriter(System.out));
		scanner = new Scanner(System.in);

	}

	public static GameConsole getInstance() {

		if (console == null) {
			console = new GameConsole();
		}

		return console;

	}

	@Override
	public void display(String content) {
		writer.println(content);
		writer.flush();

	}

	@Override
	public void displayGameControllers(List<IGameController> list) {

		StringBuilder sb = new StringBuilder();

		sb.append("**** Please Enter Game option to proceed ****\n");

		list.forEach(s -> sb.append(s.getName() + "\n"));

		display(sb.toString());

	}

	/*
	 * 
	 * (non-Javadoc)
	 * 
	 * @see com.game.display.IDisplay#readInput(java.util.List)
	 * 
	 */
	@Override
	public IGameController readInput(List<IGameController> list) {

		String input;
		IGameController controller = null;
		try {
			input = scanner.next();

			controller = list.parallelStream().filter(g -> input.toUpperCase().equals(g.getPlayerInput())).findAny()
					.orElseThrow(() -> new InvalidOptionException("Invalid Parameter : " + input));
		} catch (InvalidOptionException e) {

			display("Invalid Option Selected : Please Select Available Options");
			displayGameControllers(list);
			readInput(list);

		}

		return controller;

	}

	@Override
	public void displayScreen(IScreen screen) {

	}

	public String readInput() {
		return scanner.next();
	}

}

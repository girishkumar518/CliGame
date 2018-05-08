package com.game.exceptions;

public class InvalidOptionException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public InvalidOptionException(String argument) {
		super(argument);
	}

}

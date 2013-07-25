package org.boza.dessignpatterns.strategy.strategies.exceptions;

public class StrategyException extends Exception {

	private static final long serialVersionUID = -4896594591930174515L;

	public StrategyException() {
	}
	
	public StrategyException(final String message){
		super(message);
	}
}

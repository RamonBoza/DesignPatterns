package org.boza.dessignpatterns.strategy.strategies.context;

import org.boza.dessignpatterns.strategy.strategies.exceptions.StrategyException;

public interface StrategyContext {

	/**
	 * 
	 * @param val1 the first value to perform the strategy
	 * @param val2 the second value to perform the strategy
	 * @return the result of an strategy applicated to both values.
	 * @throws StrategyException if there are any problem with strategies
	 */
	int performStrategy(final int val1, final int val2) throws StrategyException;
}

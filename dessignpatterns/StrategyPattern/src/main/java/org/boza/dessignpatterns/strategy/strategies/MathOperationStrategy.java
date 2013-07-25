package org.boza.dessignpatterns.strategy.strategies;

public interface MathOperationStrategy {

	/**
	 * Performs a mathematical operation between two values
	 * 
	 * @param value1 the first value of the operation.
	 * @param value2 the second value of the operation.
	 * @return the result of the operation.
	 */
	int perform(final int value1, final int value2);
}

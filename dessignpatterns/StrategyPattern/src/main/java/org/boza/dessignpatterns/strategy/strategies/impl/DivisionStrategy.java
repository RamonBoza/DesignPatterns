package org.boza.dessignpatterns.strategy.strategies.impl;

import org.boza.dessignpatterns.strategy.strategies.MathOperationStrategy;

public class DivisionStrategy implements MathOperationStrategy {

	public int perform(int value1, int value2) {
		return value1 / value2;
	}

}

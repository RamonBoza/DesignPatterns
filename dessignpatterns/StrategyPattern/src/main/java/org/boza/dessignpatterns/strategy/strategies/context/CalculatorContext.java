package org.boza.dessignpatterns.strategy.strategies.context;

import org.boza.dessignpatterns.strategy.strategies.MathOperationStrategy;
import org.boza.dessignpatterns.strategy.strategies.exceptions.StrategyException;

/**
 * Hello world!
 *
 */
public class CalculatorContext implements StrategyContext
{
    private MathOperationStrategy _strategy;
    
    public CalculatorContext(){
    }
    
    public void setStrategy(final MathOperationStrategy strategy){    	
    	_strategy = strategy;
    }

	public int performStrategy(int val1, int val2) throws StrategyException {
		if(_strategy == null)
			throw new StrategyException("Strategy must be defined");
		return _strategy.perform(val1, val2);
	}
    
}

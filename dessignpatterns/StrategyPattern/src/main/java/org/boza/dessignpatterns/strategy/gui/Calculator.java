package org.boza.dessignpatterns.strategy.gui;

import java.awt.Color;
import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

import org.boza.dessignpatterns.strategy.strategies.context.CalculatorContext;
import org.boza.dessignpatterns.strategy.strategies.exceptions.StrategyException;
import org.boza.dessignpatterns.strategy.strategies.impl.AddStrategy;
import org.boza.dessignpatterns.strategy.strategies.impl.DivisionStrategy;
import org.boza.dessignpatterns.strategy.strategies.impl.MultiplyStrategy;
import org.boza.dessignpatterns.strategy.strategies.impl.SubstractStrategy;

public class Calculator extends JFrame {

	private CalculatorContext _calculatorContext;
	private JTextField _val1Field;
	private JTextField _val2Field;
	private JTextField _resultField;
	private JTextField _errorField;
	
	public static void main(String[] args) {
		Calculator calculator = new Calculator();
		calculator.setVisible(true);
	}

	public Calculator() {
		initializeBeans();
		initialize();
		initializeFrame();
	}

	private void initializeFrame() {
		setSize(500, 200);
	    setLocation(300,200);
	    setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	private void initializeBeans() {
		_calculatorContext = new CalculatorContext();
	}

	private void initialize() {
		JPanel mainPanel = new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.PAGE_AXIS));
		
		JPanel interactPanel = new JPanel();
		interactPanel.setLayout(new BoxLayout(interactPanel, BoxLayout.LINE_AXIS));
		
		JPanel valuesPanel = createValuesPanel();
		JPanel radioPanel = createRadioPanel();
		JPanel resultPanel = createResultPanel();
		
		JPanel errorPanel = createErrorField();
				
		interactPanel.add(valuesPanel);
		interactPanel.add(radioPanel);
		
		mainPanel.add(interactPanel);
		mainPanel.add(resultPanel);
		mainPanel.add(errorPanel);
		
		add(mainPanel);
		
	}

	private JPanel createErrorField() {
		_errorField = new JTextField();
		_errorField.setEnabled(false);
		_errorField.setForeground(Color.red);
		JPanel errorPanel = new JPanel();
		errorPanel.setLayout(new BoxLayout(errorPanel,BoxLayout.LINE_AXIS));
		errorPanel.add(_errorField);
		return errorPanel;
	}

	private JPanel createResultPanel() {
		JButton calculateButton = new JButton("Calculate");
		calculateButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				try {
					int val1 = Integer.parseInt(_val1Field.getText());
					int val2 = Integer.parseInt(_val2Field.getText());
					int result = _calculatorContext.performStrategy(val1, val2);
					_resultField.setText(String.valueOf(result));
				} catch (StrategyException e1) {
					_resultField.setText("");
					_errorField.setText(e1.getClass().getName()+"-"+e1.getMessage());
				} catch (NumberFormatException e2){
					_resultField.setText("");
					_errorField.setText(e2.getClass().getName()+"-"+e2.getMessage());
				}
			}
		});
		_resultField = new JTextField();
		_resultField.setEnabled(false);
		JPanel resultPanel = new JPanel();
		resultPanel.setLayout(new BoxLayout(resultPanel, BoxLayout.LINE_AXIS));
		resultPanel.add(Box.createHorizontalGlue());
		resultPanel.add(calculateButton);
		resultPanel.add(_resultField);
		return resultPanel;
	}

	private JPanel createRadioPanel() {
		ButtonGroup radioGroup = new ButtonGroup();
		
		//Creation
		JRadioButton addButton = new JRadioButton("+");
		JRadioButton minusButton = new JRadioButton("-");
		JRadioButton multiplyButton = new JRadioButton("*");
		JRadioButton divideButton = new JRadioButton("/");
		
		//Events
		addButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				_calculatorContext.setStrategy(new AddStrategy());
			}
		});
		
		minusButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				_calculatorContext.setStrategy(new SubstractStrategy());
			}
		});
		
		multiplyButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				_calculatorContext.setStrategy(new MultiplyStrategy());
			}
		});
		
		divideButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent arg0) {
				_calculatorContext.setStrategy(new DivisionStrategy());
			}
		});
		
		JPanel radioPanel = new JPanel();
		radioPanel.setLayout(new BoxLayout(radioPanel,BoxLayout.PAGE_AXIS));
		radioPanel.add(addButton);
		radioPanel.add(minusButton);
		radioPanel.add(multiplyButton);
		radioPanel.add(divideButton);
		
		radioGroup.add(addButton);
		radioGroup.add(minusButton);
		radioGroup.add(multiplyButton);
		radioGroup.add(divideButton);
		return radioPanel;
	}

	private JPanel createValuesPanel() {
		_val1Field = new JTextField();
		_val2Field = new JTextField();
		JPanel valuesPanel = new JPanel();
		valuesPanel.setLayout(new BoxLayout(valuesPanel,BoxLayout.PAGE_AXIS));
		valuesPanel.add(_val1Field);
		valuesPanel.add(_val2Field);
		return valuesPanel;
	}
	
}

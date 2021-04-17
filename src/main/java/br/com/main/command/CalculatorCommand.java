package br.com.main.command;

public class CalculatorCommand implements Command {
	
	private Calculator calculator;
		
	private String operation;
	
	private Double value;
	
	public CalculatorCommand(Calculator calculator, String operation, Double value) {
		this.calculator = calculator;
		this.operation = operation;
		this.value = value;
	}
	
	public void execute() {
		calculator.execute(operation, value);
	}

	@Override
	public void undo() {
		calculator.execute(undo(operation), value);		
	}
	
	private String undo(String operation) {
		switch (operation) {
		case "+":
			return "-";			
		case "-":
			return "+";
		case "*":
			return "/";
		case "/":
			return "*";
		default:
			return "";
		}
	}
	
	
	
}

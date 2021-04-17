package br.com.main.command;

public class Calculator {
	
	private Double currentValue = 0.00;
	
	public void execute(String operation, Double value) {
		switch (operation) {
		case "+":
			this.currentValue += value;
			break;
		case "-":
			this.currentValue -= value;
			break;
		case "*" :
			this.currentValue *= value;
			break;
		case "/":
			this.currentValue /= value;
			break;
		default:
			break;
		}
		
		System.out.println(currentValue);
	}

}

package br.com.main.command;

import java.util.ArrayList;
import java.util.List;

public class User {

	private Calculator calculator = new Calculator();
	private List<Command> commands = new ArrayList<>();

	public void addCommand(String operator, Double valor) {

		Command command = new CalculatorCommand(calculator, operator, valor);
		command.execute();

		commands.add(command);
	}

	public void undo() {
		commands.forEach(command -> command.undo());
	}

}

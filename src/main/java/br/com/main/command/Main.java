package br.com.main.command;

public class Main {
	
	public static void main(String[] args) {
		User user = new User();
		
		user.addCommand("+", 50.00);
		user.addCommand("+", 200.00);
		
		user.undo();
		
	}

}

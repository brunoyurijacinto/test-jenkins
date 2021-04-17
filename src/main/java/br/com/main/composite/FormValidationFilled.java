package br.com.main.composite;

public class FormValidationFilled implements IMessage {

	private String message;

	public FormValidationFilled(String message) {
		this.message = message;
	}

	@Override
	public void execute(int hifen) {

		

		System.out.println(message);

	}

}

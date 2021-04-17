package br.com.main.composite;

public class FormValidationFilled implements IMessage {

	private String message;

	public FormValidationFilled(String message) {
		this.message = message;
	}

	@Override
	public void execute(int hifen) {

		String sub = "-";
		String repeated = sub.repeat(hifen);
		System.out.print(repeated);

		System.out.println(message);

	}

}

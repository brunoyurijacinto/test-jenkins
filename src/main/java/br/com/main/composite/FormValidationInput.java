package br.com.main.composite;

public class FormValidationInput implements IMessage {

	private String message;
	
	public FormValidationInput(String message) {
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

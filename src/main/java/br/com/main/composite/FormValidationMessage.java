package br.com.main.composite;

import java.util.ArrayList;
import java.util.List;

public class FormValidationMessage implements IMessage {

	private String message;

	private List<IMessage> messages = new ArrayList<>();

	public FormValidationMessage(String message) {
		this.message = message;
	}

	public void execute(int hifen) {
		
		String sub = "-";
		String repeated = sub.repeat(hifen);
		System.out.print(repeated);	
		
		System.out.println(message);
				
		messages.forEach(m -> m.execute(hifen + 2));
	}

	public void addMessage(IMessage message) {
		this.messages.add(message);
	}

}

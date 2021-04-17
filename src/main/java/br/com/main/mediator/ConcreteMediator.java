package br.com.main.mediator;

public class ConcreteMediator extends Mediator {

	private Colleague collegue1;
	
	private Colleague collegue2;
	
	@Override
	public void send(String message, Colleague colleague) {
		if (colleague == collegue1) {
			collegue2.notify(message);
		}else {
			collegue1.notify(message);
		}
	}

	public Colleague getCollegue1() {
		return collegue1;
	}

	public void setCollegue1(Colleague collegue1) {
		this.collegue1 = collegue1;
	}

	public Colleague getCollegue2() {
		return collegue2;
	}

	public void setCollegue2(Colleague collegue2) {
		this.collegue2 = collegue2;
	}
	
	

}

package br.com.main.mediator;

public class ConcreateColleague2 extends Colleague {

	public ConcreateColleague2(Mediator mediator) {
		super(mediator);
	}

	public void send(String send) {
		mediator.send(send, this);
	}

	public void notify(String receive) {
		System.out.println("Colleague 2 reveived: " + receive);
	}

}

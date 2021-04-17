package br.com.main.mediator;

public class ConcreateColleague1 extends Colleague {

	public ConcreateColleague1(Mediator mediator) {
		super(mediator);
	}

	@Override
	public void send(String send) {
		mediator.send(send, this);
	}

	@Override
	public void notify(String receive) {
		System.out.println("Concreate 1 received: " + receive);
	}

}

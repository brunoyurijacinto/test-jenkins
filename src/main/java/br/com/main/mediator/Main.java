package br.com.main.mediator;

public class Main {
	
	public static void main(String args[]) {
		ConcreteMediator m = new ConcreteMediator();
		
		ConcreateColleague1 c1 = new ConcreateColleague1(m);
		ConcreateColleague2 c2 = new ConcreateColleague2(m);
		
		m.setCollegue1(c1);
		m.setCollegue2(c2);
		
		c1.send("How are you?");
		c2.send("Fine thanks?");
	}

}

package Memento.theory;

import java.util.ArrayList;
import java.util.HashMap;

public class Client {

	public static void main(String[] args) {

		Originator originator = new Originator();
		Caretaker caretaker = new Caretaker();

		originator.setState("状态1");
		caretaker.add(originator.saveStateMemento());

		originator.setState("状态2");
		caretaker.add(originator.saveStateMemento());

		originator.setState("状态3");
		caretaker.add(originator.saveStateMemento());
		System.out.println( originator.getState());
		

		originator.getStateFromMemento(caretaker.get(0));
		System.out.println(originator.getState());
		
		
		
	}

}

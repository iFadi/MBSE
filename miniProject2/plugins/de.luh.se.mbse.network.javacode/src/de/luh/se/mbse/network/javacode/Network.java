package de.luh.se.mbse.network.javacode;

import java.util.ArrayList;

public class Network {

	Channel[] channels = {new Channel("orderCoffe", "Asynchronous"), new Channel("deliverCoffe", "Asynchronous"), new Channel("payCoffe", "Asynchronous")};
//	Channel deliverCoffe;
//	Channel payCoffe;
	
	Statemachine guest;
	Statemachine waiter;
	ArrayList<Statemachine> statemachines;
	
	State waitingw;
	State waitingg;
	State drinkingCoffee;
	State preparingCoffee;
	State waitingForPayment;
	
	public static void main(String[] args) {
		Network cafe = new Network();
		System.out.println("Initializing the network ...");
		for (int i=0; i<=5; i++) {
			cafe.initialize();
		}
	}
	
	public void initialize() {
		
		// Current State of each state machine is its initial state.
		statemachines = new ArrayList<Statemachine>();
		guest = new Statemachine("Guest", waitingg);
		waiter = new Statemachine("Waiter", waitingw);
		statemachines.add(guest);
		statemachines.add(waiter);
		
		guest.setTransition(new Transition(new State("waitingw"), new State("waitingg"), "SEND", new Channel("orderCoffe", "Asynchronous")));
		guest.setTransition(new Transition(new State("waitingg"), new State("drinkingCoffee"), "RECEIVE", new Channel("deliverCoffe", "Asynchronous")));
		guest.setTransition(new Transition(new State("drinkingCoffee"), new State("waitingg"), "SEND", new Channel("payCoffe", "Asynchronous")));
		
		waiter.setTransition(new Transition(new State("waitingw"), new State("preparingCoffee"), "RECEIVE", new Channel("orderCoffe", "Asynchronous")));
		waiter.setTransition(new Transition(new State("preparingCoffee"), new State("waitingForPayment"), "SEND", new Channel("deliverCoffe", "Asynchronous")));
		waiter.setTransition(new Transition(new State("waitingForPayment"), new State("waitingw"), "RECEIVE", new Channel("payCoffe", "Asynchronous") ));
		
		System.out.println("Following statamachines have benn detected:");

		System.out.println("");

	}
	
	public void step() {
		
//		for(Statemachine sm : statemachines) {
//			if (sm.getTransition().isEnabled()) {
//				sm.setCurrentState(sm.getTransition().getTarget());
//				sm.getTransition().getChannel().setBuffer(sm.getTransition().getChannel().getBuffer()+1);
//				System.out.println("Firing a message that sends over an asynchronous channel");
//				globalExcutionState();
//				sm.getTransition().setEnabled(false);
//
//			}
//			else if(sm.getTransition().isEnabled() && sm.getTransition().getChannel().getBuffer() > 0) {
//				sm.setCurrentState(sm.getTransition().getTarget());
//				sm.getTransition().getChannel().setBuffer(sm.getTransition().getChannel().getBuffer()-1);
//				System.out.println("Firing a message that receives over an asynchronous channel");
//				globalExcutionState();
//				sm.getTransition().setEnabled(false);
//			}
//			else {
//				System.out.println("Transition not enabled.");
//				globalExcutionState();
//			}
//		}
	}
	
	public void globalExcutionState() {
		for(Statemachine sm : statemachines) {
			System.out.println("Global Execution State: ");
			System.out.println("Statemachine: " + sm.getName() + ", Current State: " + sm.getCurrentState().getName());
		}
	}
}

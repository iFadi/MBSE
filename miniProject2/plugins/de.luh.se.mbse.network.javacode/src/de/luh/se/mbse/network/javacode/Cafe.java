package de.luh.se.mbse.network.javacode;

public class Cafe {

	Channel orderCoffe;
	Channel deliverCoffe;
	Channel payCoffe;
	
	Statemachine guest;
	Statemachine waiter;
	
	State waitingw;
	State waitingg;
	State drinkingCoffee;
	State preparingCoffee;
	State waitingForPayment;
	
	public void initialize() {
		// Current State of each state machine is its initial state.
		guest = new Statemachine("guest", waitingg);
		waiter = new Statemachine("Waiter", waitingw);
		
		orderCoffe = new Channel("orderCoffe", "Asynchronous");
		deliverCoffe = new Channel("deliverCoffe", "Asynchronous");
		payCoffe = new Channel("payCoffe", "Asynchronous");

	}
	
	public void step() {
		// Firing a message that sends over an asynchronous channel
		
	}
	
	public void fireAsynMesg() {
//		for(s)
	}
}

package de.luh.se.mbse.network.javacode;

public class Network {

	private String name;
	private State globalExecutionState;
	private Statemachine[] statemachine;
	private Channel[] channel;
	
	public Network(String name) {
		setName(name);
	}

	public void initialization() {
		
	}
	
	public void step() {
		
			
	}
	
//	public State getGlobalExecutionState() {
////		return globalExecutionState;
//		State state = new State();
//		for(Statemachine s: statemachine) {
//			state = s.getCurrentState();
//		}
//		return state;
//	}

	public void setGlobalExecutionState(State globalExecutionState) {
		this.globalExecutionState = globalExecutionState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}

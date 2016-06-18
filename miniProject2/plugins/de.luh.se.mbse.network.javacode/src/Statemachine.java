import java.util.ArrayList;

public class Statemachine {

	private String name;
	private ArrayList<State> states;
	private State currentState;
	private State initialState;
	
	public Statemachine(String name) {
		// The current state of each state machine is its initial state.
		setCurrentState(getInitialState());
	}

	public State getCurrentState() {
		return currentState;
	}

	public void setCurrentState(State currentState) {
		this.currentState = currentState;
	}

	public State getInitialState() {
		return initialState;
	}

	public void setInitialState(State initialState) {
		this.initialState = initialState;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public ArrayList<State> getStates() {
		return states;
	}

	public void setStates(ArrayList<State> states) {
		this.states = states;
	}
	
	public void addState(State state) {
		this.getStates().add(state);
	}
}

package de.luh.se.mbse.network.javacode;

public class Transition {

	private State source;
	private State target;
	private String event;
	private boolean enabled;
	
	public Transition() {
		
	}

	public State getSource() {
		return source;
	}

	public void setSource(State source) {
		this.source = source;
	}

	public State getTarget() {
		return target;
	}

	public void setTarget(State target) {
		this.target = target;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}
}

package de.luh.se.mbse.network.javacode;

public class Transition {

	private State source;
	private State target;
	private Channel channel;
	private String event;
	
	public Transition(State source, State target, String event, Channel channel) {
		setSource(source);
		setTarget(target);
		setEvent(event);
		setChannel(channel);
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

	public String getEvent() {
		return event;
	}

	public void setEvent(String event) {
		this.event = event;
	}

	public Channel getChannel() {
		return channel;
	}

	public void setChannel(Channel channel) {
		this.channel = channel;
	}
}

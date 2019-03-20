package com.behavioral.memento.pattern;

public class Originator {

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Memento saveStateToMemento() {
		return new Memento(state);
	}

	public void restoreStateFromMemento(Memento memento) {
		this.state = memento.getState();
	}
}
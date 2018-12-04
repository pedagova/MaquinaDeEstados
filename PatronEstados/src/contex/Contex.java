package contex;

import states.State;

public class Contex {
	private State state;
	private char c;
	public String builder = "";

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}
	
	public void activar() {
		try {
			state.handle(this);
		} catch (Exception e) {
			System.err.println(e.getMessage());
			e.printStackTrace();
		}
	}

	public char getC() {
		return c;
	}
	
	public void setC(char c) {
		this.c = c;
	}
}

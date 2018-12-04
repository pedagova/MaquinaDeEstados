package states;

import contex.Contex;

public interface State {
	public void handle(Contex contex) throws Exception;
}

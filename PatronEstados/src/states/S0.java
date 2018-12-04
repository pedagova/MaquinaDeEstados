package states;

import contex.Contex;

public class S0 implements State{

	
	
	@Override
	public void handle(Contex contex) throws Exception {
		char aux = contex.getC();
		
		if(aux == '"') {
			contex.setState(new S1());
			return;
		}
		if(aux == '\n') {
			contex.setState(this);
			return;
		}
		if(Character.isDigit(aux)) {
			contex.setState(new S2());
			contex.builder += aux;
			return;
		}
		
		throw new Exception("Error en estado 0");
		
		
	}

}

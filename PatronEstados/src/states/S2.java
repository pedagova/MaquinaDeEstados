package states;

import contex.Contex;

public class S2 implements State{

	@Override
	public void handle(Contex contex) throws Exception {
		char aux = contex.getC();
		
		if(Character.isDigit(aux)) {
			contex.setState(this);
			contex.builder += aux;
			return;
		}
		if(aux == '*') {
			contex.setState(new S0());
			System.out.println("aqui construyo el objeto " + contex.builder);
			contex.builder = "";
			return;
		}
		throw new Exception("Error creando el objeto numero");
		
	}

}

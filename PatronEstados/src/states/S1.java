package states;

import contex.Contex;

public class S1 implements State{

	@Override
	public void handle(Contex contex) {
		
		char aux = contex.getC();
		
		if(aux == '"') {
			contex.setState(new S0());
			System.out.println("aqui construyo el objeto " + contex.builder);
			contex.builder = "";
			return;
		}
		
		contex.builder += aux;
		
	}

}

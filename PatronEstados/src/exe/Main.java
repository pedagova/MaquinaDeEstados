package exe;

import contex.Contex;
import states.S0;

public class Main {

	public static void main(String[] args) {
		Contex contex = new Contex();
		contex.setState(new S0());
		char[] input = {'\"', 'h', 'o', '\"', '4', '6', '*'};
		for(char c : input) {
			contex.setC(c);

			contex.activar();

		}

	}

}

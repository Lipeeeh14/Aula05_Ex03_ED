package controller;

import br.edu.fateczl.lipe.PilhaInt.Pilha;

public class NPRController {

	private Pilha p;
	
	public NPRController(Pilha p) {
		this.p = p;
	}

	public void insereValor(int valor) {
		p.push(valor);
	}
	
	public int npr(String op) throws Exception {
		int res, num1, num2;
		num1 = p.pop();
		num2 = p.pop();
				
		switch(op) {
			case "+":
				res = num1 + num2;
				break;
			case "-":
				res = num2 - num1;
				break;
			case "*":
				res = num1 * num2;
				break;
			case "/":
				res = num2 / num1;
				break;
			default:
				throw new Exception("Operação inválida");
		}
		p.push(res);
		return res;
	}
}

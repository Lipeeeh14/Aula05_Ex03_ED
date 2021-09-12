package view;

import javax.swing.JOptionPane;

import br.edu.fateczl.lipe.PilhaInt.Pilha;
import controller.NPRController;

public class Principal {

	public static void main(String[] args) {
		int op = 0;
		int numero;
		String operacao;
		Pilha p = new Pilha();
		NPRController npr = new NPRController(p);
		
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("Digite o que deseja fazer: \n"
														+ "1 - Adicionar um número \n"
														+ "2 - Realizar uma operação \n"
														+ "0 - Sair \n"));
			switch(op) {
				case 0:
					op = 0;
					JOptionPane.showMessageDialog(null, "Até a próxima!");
					break;
				case 1:
					numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro"));
					npr.insereValor(numero);
					break;
				case 2:
					operacao = JOptionPane.showInputDialog("Digite a operação");
					try {
						JOptionPane.showMessageDialog(null, "Resultado: " + npr.npr(operacao));
					} catch (Exception e) {
						e.printStackTrace();
					}
					break;
				default:
					JOptionPane.showMessageDialog(null, "Opção inválida, tente novamente!");
			}
		} while(op != 0);

	}

}

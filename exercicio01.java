import java.util.*;
import javax.swing.JOptionPane;

public class exercicio01 {

	Scanner receba = new Scanner(System.in);

	public static void MontarTela() {

		String msg = String.format("1. Jogar \n2. Instruções \n3. Creditos \n4. Sair \n ");

		int num;

		msg = JOptionPane.showInputDialog(null, msg, "MENU", JOptionPane.PLAIN_MESSAGE);
		num = Integer.parseInt(msg);

		switch (num) {

			case 1:

				Questoes();

				break;

		}

	}

	public static void Questoes() {

		String preguntas = String.format("Neymar foi para quantas copas? \n 1. 4\n 2. 5\n 3. 3");
		int opcoes;

		preguntas = JOptionPane.showInputDialog(null, preguntas, "QUESTOES", JOptionPane.PLAIN_MESSAGE);
		opcoes = Integer.parseInt(preguntas);

		if (opcoes == 3) {
			RespostaCorreta();
		}

	}

	public static void RespostaCorreta() {

		JOptionPane.showMessageDialog(null, "Correto", null, JOptionPane.PLAIN_MESSAGE);
	}

	public static void main(String[] args) {

		MontarTela();

	}

}

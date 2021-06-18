/*Ler a hora de início e a hora de fim de um jogo de Xadrez (considere apenas 
 * horas inteiras, sem os minutos) e calcule a duração do jogo em horas, 
 * sabendo-se que o tempo máximo de duração do jogo é de 24 horas e que o jogo 
 * pode iniciar em um dia e terminar no dia seguinte.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio21 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas se iniciou o jogo?");
		int inicio = sc.nextInt();
		System.out.println("Que horas terminou o jogo?");
		int termino = sc.nextInt();

		if (termino < inicio) {
			int duracao = (24 - inicio) + termino;
			System.out.println("O jogo teve a duração de:" + duracao + "horas.");
		} else if (termino > inicio) {
			int duracao = termino - inicio;
			System.out.println("O jogo teve a duração de:" + duracao + "horas.");
		} else {
			int duracao = 24;
			System.out.println("O jogo teve a duração de:" + duracao + "horas.");
			sc.close();
		}

	}

}

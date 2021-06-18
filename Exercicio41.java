/*Faça um algoritmo para ler as 3 notas obtidas por um aluno nas 3 verificações e 
 * a média dos exercícios que fazem parte da avaliação. Calcular a média de 
 * aproveitamento, usando a fórmula abaixo e escrever o conceito do aluno de 
 * acordo com a tabela de conceitos mais abaixo*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio41 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira primeira nota:");
		float n1 = sc.nextFloat();
		System.out.println("Insira a segunda nota:");
		float n2 = sc.nextFloat();
		System.out.println("Insira a terceira nota:");
		float n3 = sc.nextFloat();
		float media = (n1 + n2 + n3) / 3;
		float mediaaprov = (((n1 + n2 * 2) + (n3 * 3)) + media) / 7;

		if (mediaaprov >= 9.0f && mediaaprov <=10.0f) {
			System.out.println("Sua média foi:"+mediaaprov);
			System.out.println(" A");
		} else if (mediaaprov >= 7.5f && mediaaprov < 9.0f) {
			System.out.println("Sua média foi:"+mediaaprov);
			System.out.println(" B");
		} else if (mediaaprov >= 6.0 && mediaaprov < 7.5f) {
			System.out.println("Sua média foi:"+mediaaprov);
			System.out.println(" C");
		} else if (mediaaprov < 6.0f && mediaaprov >=0) {
			System.out.println("Sua média foi:"+mediaaprov);
			System.out.println(" D");
		} else {
			System.out.println("Error");
			sc.close();
		}
	}

}

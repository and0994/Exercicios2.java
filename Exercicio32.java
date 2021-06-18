/*) Ler o nome de 2 times e o número de gols marcados na partida (para cada time). 
 * Escrever o nome do vencedor. Caso não haja vencedor deverá ser impressa a 
 * palavra EMPATE. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio32 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o nome do primeiro time:");
		String time1=sc.next();
		System.out.println("Quantos gols esse time fez?");
		int golst1=sc.nextInt();
		System.out.println("Digite o nome do segundo time:");
		String time2=sc.next();
		System.out.println("Quantos gols esse time fez?");
		int golst2=sc.nextInt();
		
		if (golst1>golst2) {
			System.out.println("O "+time1+" foi o vencedor da partida.");
		}
		else if (golst1<golst2) {
			System.out.println("O "+time2+" foi o vencedor da partida.");
		}
		else {
			System.out.println("A partida terminou em empate.");
			sc.close();
		}
	}
}

// Ler um valor e escrever se é positivo, negativo ou zero.

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio27 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira um valor:");
		int v=sc.nextInt();
		if (v>0) {
			System.out.println("Valor POSITIVO.");
		}
		else if (v<0) {
			System.out.println("Valor NEGATIVO");
		}
		else {
			System.out.println("Valor igual a 0");
			sc.close();
		}
	}
}

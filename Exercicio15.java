//Ler um valor e escrever se é POSITIVO OU NEGATIVO(considere 0 como positivo

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio15 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira um valor:");
		int valor=sc.nextInt();
		
		if (valor>=0) {
			System.out.println("Positivo");
		} else {
			System.out.println("Negativo");
			sc.close();
		}
		
		
	}

}

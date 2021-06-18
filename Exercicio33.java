/*Ler dois valores e imprimir uma das três mensagens a seguir: 
 * ‘Números iguais’, caso os números sejam iguais 
 *‘Primeiro é maior’, caso o primeiro seja maior que o segundo; 
 *‘Segundo maior’, caso o segundo seja maior que o primeiro.*/


package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio33 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		float v1=sc.nextFloat();
		System.out.println("Insira o primeiro valor:");
		float v2=sc.nextFloat();
		
		if (v1==v2) {
			System.out.println("Números iguais.");
		}
		else if (v1>v2) {
			System.out.println("Primeiro é maior.");
		}
		else {
			System.out.println("Segundo é maior.");
			sc.close();
		}
	}
}

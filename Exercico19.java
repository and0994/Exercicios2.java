/*Ler dois valores (considere que não serão lidos valores iguais) e escrever o 
 * maior deles*/

package exerciciodia11.java;

import java.util.Scanner;

import explicacoes.PrimeiroProgramaJava;

public class Exercicio19 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		float valor1=sc.nextFloat();
		System.out.println("Digite o segundo valor:");
		float valor2=sc.nextFloat();
		
		if (valor1>valor2) {
			System.out.println("O maior valor é o:"+valor1);
			
		} else {
			System.out.println("O maior valor é o:"+valor2);
			}sc.close();
	}

}

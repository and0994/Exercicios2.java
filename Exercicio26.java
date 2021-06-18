/*Faça um algoritmo para ler: quantidade atual em estoque, quantidade máxima em 
 * estoque e quantidade mínima em estoque de um produto. Calcular e escrever a 
 * quantidade média ((quantidade média = quantidade máxima + quantidade mínima)/2). 
 * Se a quantidade em estoque for maior ou igual a quantidade média escrever a 
 * mensagem 'Não efetuar compra', senão escrever a mensagem 'Efetuar compra'.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio26 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira a quantidade atual do estoque:");
		float quantatual=sc.nextFloat();
		System.out.println("Insira a quantidade máxima em estoque:");
		float quantmax=sc.nextFloat();
		System.out.println("Insira a quantidade mínima em estoque:");
		float quantmin=sc.nextFloat();
		float quantmedia= (quantmax + quantmin)/2;
		if (quantatual>=quantmedia) {
			System.out.println("Não efetuar compra");
		} else {
			System.out.println("Efetuar compra");
		sc.close();
		}
	}
	
	

}

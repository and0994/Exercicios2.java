/* Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem que 
 * diga se ela poderá ou não votar este ano (não é necessário considerar o mês 
 * em que a pessoa nasceu).*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio18 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int anoatual= 2021;
		System.out.println("Digite o seu ano do seu nascimento:");
		int anonasc=sc.nextInt();
		int idade=anoatual - anonasc;
		
		if (idade>=16) {
			System.out.println("Você poderá votar nesse ano.");
		} else {
			System.out.println("Você não poderá votar nesse ano.");
			sc.close();
		}
	}

}

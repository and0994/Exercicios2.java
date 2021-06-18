/*Faça um algoritmo para ler: número da conta do cliente, saldo, débito e crédito. 
 * Após, calcular e escrever o saldo atual (saldo atual = saldo - débito + 
 * crédito). Também testar se saldo atual for maior ou igual a zero escrever a 
 * mensagem 'Saldo Positivo', senão escrever a mensagem 'Saldo Negativo'. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio25 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o número da sua conta");
		int numconta=sc.nextInt();
		System.out.println("Qual o saldo da sua conta?");
		float saldo=sc.nextFloat();
		System.out.println("Qual o saldo do débito da sua conta?");
		float debito=sc.nextFloat();
		System.out.println("Qual o saldo do crédito da sua conta?");
		float credito=sc.nextFloat();
		float saldoatual= saldo - debito + credito;
		
		if (saldoatual >=0) {
			System.out.println("Cliente da conta:"+numconta+"\n Você tem um SALDO POSITIVO de:"+saldoatual);
		} else {
			System.out.println("Cliente da conta:"+numconta+"\n Você tem um SALDO NEGATIVO de"+saldoatual);
		sc.close();
		}
	}

}

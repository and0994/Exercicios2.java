package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio10 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o valor do custo de fábica do carro:");
		float custofabrica = sc.nextFloat();
		float distribuidor=28;
		float impostos=45;
		float valoramais= distribuidor/100 * custofabrica + impostos/100 * custofabrica;
		float valorconsumidor=valoramais+custofabrica;
		
		System.out.println("O valor que o consumidor irá pagar pelo carro é:"
+valorconsumidor);
		sc.close();
	}

}

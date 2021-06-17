/*As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 
 * se forem compradas pelo menos 12. Escreva um programa que leia o número de 
 * maçãs compradas, calcule e escreva o custo total da compra.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exerciccio16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Quantas maças foram compradas?");
		int quant=sc.nextInt();
		double menosdoze=1.3 * quant;
		
		if (quant>=12) {
			System.out.println("O custo total da compra foi de:"+quant);
		} else {
			System.out.println("O custo total da compra foi de:"+menosdoze);
			sc.close();
		}
	}
		
}

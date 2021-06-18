/*Ler 3 valores (considere que não serão informados valores iguais) e escrever o 
 * maior deles. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio28 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		int v1=sc.nextInt();
		System.out.println("Insira o segundo valor:");
		int v2=sc.nextInt();
		System.out.println("Insira o terceiro valor:");
		int v3=sc.nextInt();
		
		if (v1>v2) {
			System.out.println("Maior valor:"+v1);
		}
		else if (v2>v3) {
			System.out.println("Maior valor:"+v2);
		}
		else if (v3>v1) {
			System.out.println("Maior valor:"+v3);
		}
		else {
			System.out.println("Erro");
			sc.close();
		}
	}
}

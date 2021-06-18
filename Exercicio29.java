/*Ler 3 valores (considere que não serão informados valores iguais) e escrever a 
 * soma dos 2 maiores.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio29 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		int v1 = sc.nextInt();
		System.out.println("Insira o segundo valor:");
		int v2 = sc.nextInt();
		System.out.println("Insira o terceiro valor:");
		int v3 = sc.nextInt();

		if (v1 > v2 && v2 > v3) {
			int soma = v1 + v2;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		} else if (v2 > v1 && v1 > v3) {
			int soma = v1 + v2;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		}
		else if (v1>v3 && v3>v2) {
			int soma=v1 + v3;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		}
		else if (v3>v1 && v1>v2) {
			int soma=v1 + v3;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		}
		else if (v2>v3 && v3>v1) {
			int soma=v2 + v3;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		}
		else if (v3>v2 && v2>v1) {
			int soma=v2 + v3;
			System.out.println("A soma dos dois maiores valores é:" + soma);
		}
		else {
			System.out.println("Error");
			sc.close();
		}
		
		}
	}


/*Ler 3 valores (A, B e C) representando as medidas dos lados de um triângulo e 
 * escrever se formam ou não um triângulo. OBS: para formar um triângulo, o valor 
 * de cada lado deve ser menor que a soma dos outros 2 lados.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio31 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado A:");
		int a = sc.nextInt();
		System.out.println("Digite o tamanho do lado B:");
		int b = sc.nextInt();
		System.out.println("Digite o tamanho do lado C:");
		int c = sc.nextInt();

		// a <b+c true
		if (a < b + c) {
			System.out.println("Formam um triângulo");
		}else if (a >= b + c) {
			System.out.println("Não formam um triângulo");
			
		}else if (b < a + c) {
			System.out.println("Formam um triângulo");
		}else if (b >= a + c) { 
			System.out.println("Não formam um triângulo");
			
		}else if (c < a + b) {
			System.out.println("Formam um triângulo");
		} else if (c >= a + b) {
			System.out.println("Não formam um triângulo");
			
		}else {
			System.out.println("Não formam um triângulo");
		}
	}
}




//NÃO FINALIZADO

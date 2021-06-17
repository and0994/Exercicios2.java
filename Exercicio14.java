/*Ler um valor e escrever a mensagem É MAIOR QUE 10! se o valor lido for maior que
 * 10, caso contrario escrever NÃO É MAIOR QUE 10 */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio14 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira um valor:");
		int valor=sc.nextInt();
		
		if (valor>10) {
			System.out.println("É maior que 10!");	
		} else {
			System.out.println("Não é maior que 10!");
			sc.close();
		}
	}
	
}



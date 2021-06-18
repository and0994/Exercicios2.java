/* Ler dois valores (considere que não serão lidos valores iguais) e escrevê-los 
 * em ordem crescente. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio20 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o primeiro valor:");
		int v1=sc.nextInt();
		System.out.println("Digite o segundo valor:");
		int v2=sc.nextInt();
		
		if (v1 > v2) {
			System.out.println(+v2+"\n"+v1);
			
		} else {
			System.out.println(+v1+"\n"+v2);
			sc.close();
		}
	}

}

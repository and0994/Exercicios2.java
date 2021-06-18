/*Ler 3 valores (considere que não serão informados valores iguais) e escrevê-los 
 * em ordem crescente. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio30 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o primeiro valor:");
		int v1 = sc.nextInt();
		System.out.println("Insira o segundo valor:");
		int v2 = sc.nextInt();
		System.out.println("Insira o terceiro valor:");
		int v3 = sc.nextInt();
		// +v2+", "+v1+","+v3 +v3+", "+v2+","+v1
		if (v1 < v2 && v2 < v3) {
			System.out.println(+v1 + ", " + v2 + ", " + v3);
		} else if (v1 < v3 && v3 < v2) {
			System.out.println(+v1 + ", " + v3 + ", " + v2);
		} else if (v2 < v1 && v1 < v3) {
			System.out.println(+v2 + ", " + v1 + ", " + v3);
		} else if (v2 < v3 && v3 < v1) {
			System.out.println(+v2 + ", " + v3 + ", " + v1);
		} else if (v3 < v1 && v1 < v2) {
			System.out.println(+v3 + ", " + v1 + ", " + v2);
		} else if (v3 < v2 && v2 < v1) {
			System.out.println(+v3 + ", " + v2 + ", " + v1);
		} else {
			System.out.println("Error");
			sc.close();
		}

	}
}

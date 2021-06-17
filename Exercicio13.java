/*Faça um algoritmo que leia res notas de um aluno, calcule e escreva a média final
 * deste aluno.Considerar que a média é ponderada e que o peso das notas é 2, 3 e 
 * 5.
  */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Insira a sua primeira nota:");
		float n1=sc.nextInt();
		System.out.println("Insira a sua segunda nota:");
		float n2=sc.nextInt();
		System.out.println("Insira a sua terceira nota:");
		float n3=sc.nextInt();
		float media=n1*2 + n2*3 + n3*5;
		float mediafinal=media/10;
		
		System.out.println("A média final é:"+mediafinal);
		sc.close();
		
	}

}

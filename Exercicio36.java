/*Escreva um algoritmo que leia as idades de 2 homens e de 2 mulheres (considere 
 * que as idades dos homens serão sempre diferentes entre si, bem como as das 
 * mulheres). Calcule e escreva a soma das idades do homem mais velho com a mulher 
 * mais nova, e o produto das idades do homem mais novo com a mulher mais velha.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio36 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Escreva a idade do primeiro homem:");
		int hom1=sc.nextInt();
		System.out.println("Escreva a idade do segundo homem:");
		int hom2=sc.nextInt();
		System.out.println("Escreva a idade da primeira mulher:");
		int mul1=sc.nextInt();
		System.out.println("Escreva a idade da segunda mulher:");
		int mul2=sc.nextInt();
		
		if (hom1>hom2 && mul1>mul2) {
			System.out.println("hom1 + mul2");
			System.out.println("A soma do homem mais");
		}else if(hom1>hom2 && mul1<mul2) {
			System.out.println("hom1 + mul1");
		}
		else if (hom1<hom2 && mul1>mul2) {
			System.out.println("hom2 + mul2");
		}
		else if (hom1<hom2 && mul1<mul2) {
			System.out.println("hom2 + mul1");
		}
		else {
			System.out.println("Error");
			sc.close();
		}
	}
}

/* Escreva um algoritmo para ler uma temperatur em graus Fahrenheint, calcular e 
 * escrever o valor corespondente em graus Celsius */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio12 {
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Insira a tempertura em Fahrenheint:");
		float fahren=sc.nextFloat();
		float convercao= (5 * (fahren - 32) /9f);
		 System.out.println("A temperatura em graus é de:"+convercao+"°C");
		 sc.close();
	}

}

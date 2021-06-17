/*Escreva um algoritmo para ler o número total de eleitores de um município, o número de votos
brancos, nulos e válidos. Calcular e escrever o percentual que cada um representa em relação ao total
de eleitores.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio8 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Digite a quantidade de eleitores: ");
		float eleitores=sc.nextFloat();
		System.out.println("Digite a quantidade de votos brancos: ");
		float brancos=sc.nextFloat();
		System.out.println("Digite a quantidade de votos nulos: ");
		float nulos=sc.nextFloat();
		System.out.println("Digite a quantidade de votos validos: ");
		float validos=sc.nextInt();
		float porcenbranco = brancos/eleitores *100;
		float porcennulos = nulos/eleitores * 100;
		float porcenvalidos = validos/eleitores * 100;
		
		System.out.println("A porcentagem de votos brancos, nulos e validos é de:"+porcenbranco+"%, "+porcennulos+"% "+porcenvalidos+"%");
		sc.close();
		
		
		
	}
}

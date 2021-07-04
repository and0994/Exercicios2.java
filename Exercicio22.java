/*A jornada de trabalho semanal de um funcionário é de 40 horas. O funcionário 
 * que trabalhar mais de 40 horas receberá hora extra, cujo cálculo é o valor da 
 * hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o número 
 * de horas trabalhadas em um mês, o salário por hora e escreva o salário total 
 * do funcionário, que deverá ser acrescido das horas extras, caso tenham sido 
 * trabalhadas (considere que o mês possua 4 semanas exatas). */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio22 {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Quantas horas você trabalhou nesse mês:");
		int horas= sc.nextInt();
		System.out.println("Quanto você recebe por hora:");
		float valorhora=sc.nextFloat();
		float hrextravl1 = (50 / 100) * valorhora;
		float hrextravl2 = hrextravl1 + valorhora;
		System.out.println(hrextravl2);
		
		//NÃO FINALIZADO
		
	}

}

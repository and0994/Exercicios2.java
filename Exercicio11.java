/*Uma revendedora de carros usados paga a seus funcionários vendedores um 
*salário fixo por mês,mais uma comissão também fixa para cada carro vendido e 
*mais 5% do valor das vendas por ele efetuadas. Escrever um algoritmo que leia o 
*número de carros por ele vendidos, o valor total de suas vendas, o salário fixo 
*e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do 
*vendedor.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio11 {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite a quantidade de carros vendidos:");
		float quantcarros=sc.nextFloat();
		System.out.println("Digite o valor das vendas:");
		float valorvendas=sc.nextFloat();
		System.out.println("Digite o salario fixo:");
		float salario=sc.nextFloat();
		System.out.println("Valor que recebe por carro vendido:");
		float valorpcarro=sc.nextFloat();
		float comissaoporcarro= quantcarros * valorpcarro;
		float valorvendasacres=5/100 * valorvendas;
		float salariototal= comissaoporcarro + valorvendasacres + salario;
		
		System.out.println("O valor total do sálario é:"+salariototal);
		sc.close();
		
	}
}
		
	


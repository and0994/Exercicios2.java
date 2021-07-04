/*) Um posto está vendendo combustíveis com a seguinte tabela de descontos: 
até 20 litros, desconto de 3% por litro Álcool 
acima de 20 litros, desconto de 5% por litro 
até 20 litros, desconto de 4% por litro Gasolina 
acima de 20 litros, desconto de 6% por litro 
Escreva um algoritmo que leia o número de litros vendidos e o tipo de combustível  (codificado da 
seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se 
que o preço do litro da gasolina é R$ 3,30 e o preço do litro do álcool é R$ 2,90.*/

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio35 {

	// litro * 3/100 
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Digite o número correspondente ao tipo de combustivel:\n 1.Álcool\n 2.Gasolina");
		int tipo=sc.nextInt();
		System.out.println("Digite os litros do combustivel:");
		int litros=sc.nextInt();
		float alcool=2.90f;
		float gasolina=3.30f;
		
		if (tipo==1 && litros<=20) {
			float 
		//NÃO FINALIZADO
	}


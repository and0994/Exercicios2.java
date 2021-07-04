/*Uma fruteira está vendendo frutas com a seguinte tabela de preços:
 * Se o cliente comprar mais de 8 Kg em frutas ou o valor total da compra 
 * ultrapassar R$ 25,00, receberá ainda um desconto de 10% sobre este total. 
 * Escreva um algoritmo para ler a quantidade (em Kg) de morangos e a quantidade 
 * (em Kg) de maças adquiridas e escreva o valor a ser pago pelo cliente. */

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio37 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite quanto kg de morangos você comprou:");
		int kgmoran = sc.nextInt();
		System.out.println("Digite quanto kg de maças você comprou:");
		int kgmaca = sc.nextInt();

		if (kgmoran <= 5 && kgmaca <= 5) {
			float valormoran = kgmoran * 2.50f;
			float valormaca = kgmaca * 1.80f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran <= 5 && kgmaca > 5 && kgmaca <= 8) {
			float valormoran = kgmoran * 2.50f;
			float valormaca = kgmaca * 1.50f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran <= 5 && kgmaca > 8) {
			float valormoran = kgmoran * 2.50f;
			float percentual = 10.0f / 100f;
			float valormaca = kgmaca * 1.50f - (percentual * (kgmaca * 1.50f));
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran > 5 && kgmoran <= 8 && kgmaca <= 5) {
			float valormoran = kgmoran * 2.20f;
			float valormaca = kgmaca * 1.80f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran > 5 && kgmoran <= 8 && kgmaca > 5 && kgmaca <= 8) {
			float valormoran = kgmoran * 2.20f;
			float valormaca = kgmaca * 1.50f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran >= 5 && kgmaca > 8) {
			float valormoran = kgmoran * 2.20f;
			float percentual = 10.0f / 100f;
			float valormaca = kgmaca * 1.50f - (percentual * (kgmaca * 1.50f));
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran > 8 && kgmaca <= 5) {
			float percentual = 10.0f / 100f;
			float valormoran = kgmoran * 2.20f - (percentual * (kgmoran * 2.20f));
			float valormaca = kgmaca * 1.80f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran > 8 && kgmaca > 5 && kgmaca <= 8) {
			float percentual = 10.0f / 100f;
			float valormoran = kgmoran * 2.20f - (percentual * (kgmoran * 2.20f));
			float valormaca = kgmaca * 1.50f;
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else if (kgmoran > 8 && kgmaca > 8) {
			float percentual = 10.0f / 100f;
			float valormoran = kgmoran * 2.20f - (percentual * (kgmoran * 2.20f));
			float valormaca = kgmaca * 1.50f - (percentual * (kgmaca * 1.50f));
			System.out.println("Valor a ser pago pelos morangos é de:" + valormoran);
			System.out.println("Valor a ser pago pelas maças é de:" + valormaca);
		} else {
			System.out.println("Error");
		}

	}
}

package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio9 {

	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite o valor do deu salario:");
		float salario=sc.nextFloat();
		System.out.print("Digite o valor do reajuste:");
		float valorReajuste=sc.nextFloat();
		float reajuste=valorReajuste * salario / 100;
		float novosalario= salario + reajuste;
		
		System.out.print("O seu novo salário tem o valor de: "+novosalario);
		sc.close();
		
	}
	
}

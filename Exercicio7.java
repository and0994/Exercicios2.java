package exerciciodia11.java;

import java.util.Scanner;

public class Exercicio7 {
	
	public static void main(String[]args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Digite quantos anos você tem:");
		int anos=sc.nextInt();
		System.out.print("A quantos meses foi o seu ultimo aniversario:");
		int meses=sc.nextInt();
		System.out.print("A quantos dias foi o seu ultimo mesversario:");
		int dias=sc.nextInt();
		int anodias= anos*365;
		int mesdias= meses*30;
		int total= anodias+mesdias+dias;
		
		System.out.println("A sua idade em dias é de:"+total);
		sc.close();
	}
}
		

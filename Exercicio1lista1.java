package pacoteJava;

import java.util.Scanner;

public class Exercicio1lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,maior = 0;
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Entre com o primeiro valor: ");
		num1 = ler.nextInt();
		if (num1 > maior) {
			maior = num1;
		}
		
		System.out.println("Entre com o segundo valor: ");
		num2 = ler.nextInt();
		if (num2 > maior) {
			maior = num2;
		}
		
		System.out.println("Entre com o terceiro valor: ");
		num3 = ler.nextInt();
		if (num3 > maior) {
			maior = num3;
		}
		
		System.out.printf("O maior numero foi %d!!!!!", maior);
		
	}

}

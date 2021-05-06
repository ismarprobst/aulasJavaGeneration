package aula2Repeticao;

import java.util.Scanner;

public class ex6lista2dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero;
		float somamult3 = 0,qtdadeMult3 = 0;
		float mediamult3;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Insira um numero ou digite 0 para finalizar: ");
			numero = leia.nextInt();
			
			if (numero % 3 == 0 && numero != 0) {
				qtdadeMult3++;
				somamult3 = somamult3 + numero;
			}
		} while (numero != 0);
		
		mediamult3 = somamult3 / qtdadeMult3;
		
		System.out.println("A media dos numeros inseridos que sao multiplos de 3 é: "+mediamult3);
	}

}

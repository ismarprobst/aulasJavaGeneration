package aula2Repeticao;

import java.util.Scanner;

public class ex5lista2dowhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numero,soma = 0;
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Insira um numero: ");
			numero = leia.nextInt();
			
			soma = soma + numero;
			
			
		} while (numero != 0);
		
		
		System.out.println("Soma dos numeros: "+soma);
	}

}

package pacoteJava;

import java.util.Scanner;

public class Exercicio4lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1,raizquad,quadrado;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Por favor, insira qualquer numero: ");
		num1 = leia.nextDouble();
		
		if ((num1 % 2) == 0) {
			raizquad = Math.sqrt(num1);
			System.out.printf("\nA raiz quadrada de %2.2f é: %2.2f",num1,raizquad);
		} else {
			quadrado = Math.pow(num1,2);
			System.out.printf("\nO quadrado de %2.2f é: %.2f",num1,quadrado);
		}
	}

}

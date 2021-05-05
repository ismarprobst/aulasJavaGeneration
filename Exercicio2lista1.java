package pacoteJava;

import java.util.Scanner;

public class Exercicio2lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1,num2,num3,menor;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira o primeiro numero: ");
		num1 = leia.nextInt();
		System.out.println("Insira o segundo numero: ");
		num2 = leia.nextInt();
		System.out.println("Insira o terceiro numero: ");
		num3 = leia.nextInt();
		
		if (num1 <= num2 && num2 <= num3) {
			System.out.println("\nOrdem crescente: "+num1 +", "+num2+", "+num3);
		} else if (num1 <= num3 && num3<= num2) {
			System.out.println("\nOrdem crescente: "+num1 +", "+num3+", "+num2);
			
		} else if (num2 <= num1 && num1<= num3) {
			System.out.println("\nOrdem crescente: "+num2 +", "+num1+", "+num3);
			
		} else if (num2 <= num3 && num3 <= num1) {
			System.out.println("\nOrdem crescente: "+num2 +", "+num3+", "+num1);
			
		} else if (num3 <= num1 && num1 <= num2) {
			System.out.println("\nOrdem crescente: "+num3 +", "+num1+", "+num2);
			
		} else {
			System.out.println("\nOrdem crescente: "+num3 +", "+num2+", "+num1);
		}
		
		
	}

}

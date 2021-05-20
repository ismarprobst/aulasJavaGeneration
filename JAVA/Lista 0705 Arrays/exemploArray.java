package aula3VetoresEMatriz;

import java.util.Scanner;

public class exemploArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int [5];
		int somapar = 0,quantimpar = 0,i;
		Scanner leia = new Scanner(System.in);
		
		for (i = 0;i <5;i++) { // comeca no 0 pq o primeiro indice e 0.
			System.out.println("Entre com um numero: ");
			numeros[i] = leia.nextInt();
			
			if (numeros[i] % 2 == 0) {
				somapar = somapar + numeros[i];
			}
			else {
				quantimpar++;
			}
			
		}
		for (i=0;i<5;i++) {
			if (numeros[i]%2 == 0) {
				System.out.println("\nNumeros " + numeros[i] + "<-- Este numero e par");
			} else {
				System.out.println("\nNumeros " + numeros[i] + "<-- Este numero e impar");
			}
		}
		
		System.out.println("Somatorio de pares: " + somapar);
		System.out.println("Quantidade de impares: " + quantimpar);
	}

}

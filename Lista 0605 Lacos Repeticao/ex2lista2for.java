package aula2Repeticao;

import java.util.Scanner;

public class ex2lista2for {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int qtdadepar = 0,qtdadeimpar = 0,numero,i;
		Scanner leia = new Scanner(System.in);
		
		for (i=1;i<=10;i++)
		{
			System.out.println("Insira um numero: ");
			numero = leia.nextInt();
			if (numero%2 == 0) {
				qtdadepar++;
				
			} else {
				qtdadeimpar++;
			}
		}
		
		System.out.println("Quantidade de numeros pares: "+qtdadepar);
		System.out.println("Quantidade de numeros impares: "+qtdadeimpar);
	}

}
/*
 * Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)
 * 
 * 
 * 
 * 
 */

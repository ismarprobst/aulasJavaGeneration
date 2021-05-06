package aula2Repeticao;

import java.util.Scanner;

public class ex3lista2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade,total21 = 0,total50 = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira a idade: ");
		idade = leia.nextInt();
		
		while (idade != -99) {
			
			if (idade < 21) {
				total21++;
			} else if(idade > 50) {
				total50++;
			}
			
			System.out.println("Insira a idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Quantidade de pessoas com menos de 21 anos: " + total21);
		System.out.println("Quantidade de pessoas com mais de 50 anos: " + total50);
	}

}
/*
 * Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
idade for =-99.
 * 
 * 
 * 
 */

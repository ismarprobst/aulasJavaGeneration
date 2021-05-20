package aula3VetoresEMatriz;

import java.util.Scanner;

public class ex3lista3ArraysMatriz {
/*
 * Leia uma matriz 3 x 3, conte e escreva quantos valores maiores que 10 ela possui.
 * 
 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] matriz = new int [3][3];
		int contador10mais = 0,i,j;
		
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 3;j++) {
				System.out.println("\nInsira um valor para preencher uma matriz 3x3: ");
				matriz[i][j] = leia.nextInt();
				
				if (matriz[i][j] > 10) {
					contador10mais++;
				}
			}
		}
		System.out.println("\nA matriz possui "+contador10mais+" valores acima de 10.");
		
		
	}

}

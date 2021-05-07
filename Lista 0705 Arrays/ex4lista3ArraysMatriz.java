package aula3VetoresEMatriz;

import java.util.Scanner;

/*
 * Faça um programa que leia duas matrizes 2 x 2 com valores reais. Ofereça ao usuário um
menu de opções:
(1) somar as duas matrizes
(2) subtrair a primeira matriz da segunda
(3) adicionar uma constante as duas matrizes
(4) imprimir as matrizes
Nas duas primeiras opções uma terceira matriz 2 x 2 deve ser criada. Na terceira opção o valor
da constante deve ser lido e o resultado da adição da constante deve ser armazenado na
própria matriz.
 */



public class ex4lista3ArraysMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float [][] matriz1 = new float [2][2];
		float [][] matriz2 = new float [2][2];
		float [][] somaMatriz = new float [2][2];
		float [][] subMatriz = new float [2][2];
		
		int opcao,i,j;
		final float constante;
		Scanner leia = new Scanner(System.in);
		
		for (i = 0; i < 2;i++) {
			for (j = 0;j < 2;j++) {
				System.out.printf("Insira uma variavel para matriz1[%d][%d]: ",i,j);
				matriz1[i][j] = leia.nextFloat();
			}
		}
		for (i = 0; i < 2;i++) {
			for (j = 0;j < 2;j++) {
				System.out.printf("Insira uma variavel para matriz2[%d][%d]: ",i,j);
				matriz2[i][j] = leia.nextFloat();
			}
		}
		
		
		
		System.out.println("\nSelecione uma das seguintes opcoes: \n 1 - Somar as matrizes\n 2 - Subtrair M1 de M2 \n 3 - Adicionar uma constante nos elementos das matrizes\n 4 - Apenas imprimir as matrizes ");
		opcao = leia.nextInt();
		
		switch (opcao){
		case 1:	
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					somaMatriz[i][j] = matriz1[i][j]+matriz2[i][j];
			}
		}
			System.out.println("A matriz somada fica: ");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(somaMatriz[i][j]+ "|");
			}
				System.out.print("\n");
		}
			
			break;
		case 2:
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					subMatriz[i][j] = matriz2[i][j] - matriz1[i][j];
			}
		}
			System.out.println("A matriz subtraida fica: ");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(subMatriz[i][j]+ "|");
			}
				System.out.print("\n");
		}
			
			break;
		case 3:
			System.out.println("Qual sera a constante escolhida?");
			constante = leia.nextFloat();
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					
					matriz1[i][j] = matriz1[i][j] + constante;
					matriz2[i][j] = matriz2[i][j] + constante;
				}
			}
			System.out.println("As matrizes resultantes sao as seguintes: ");
			System.out.println("Matriz 1:");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(matriz1[i][j]+ "|");
			}
				System.out.print("\n");
		}
			System.out.println("Matriz 2:");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(matriz2[i][j]+ "|");
			}
				System.out.print("\n");
			}
			break;
		case 4:
			System.out.println("Matriz 1:");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(matriz1[i][j]+ "|");
			}
				System.out.print("\n");
		}
			System.out.println("Matriz 2:");
			for (i = 0; i < 2;i++) {
				for (j = 0;j < 2;j++) {
					System.out.print(matriz2[i][j]+ "|");
			}
				System.out.print("\n");
			}
			
			break;
		default:
			System.out.println("Voce inseriu uma opcao invalida!");
			break;
		}
	
	
	
	}

}

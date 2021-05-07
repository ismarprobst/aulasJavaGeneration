package aula3VetoresEMatriz;

public class ex1lista3ArraysVetores {

	/*
	 * Faça um programa que possua um vetor denominado A que armazene 6 números
inteiros. O programa deve executar os seguintes passos:
(a) Atribua os seguintes valores a esse vetor: 1, 0, 5, -2, -5, 7.
(b) Armazene em uma variável inteira (simples) a soma entre os valores das posições
A[0], A[1] e A[5] do vetor e mostre na tela esta soma.
(c) Modifique o vetor na posição 4, atribuindo a esta posição o valor 100.
(d) Mostre na tela cada valor do vetor A, um em cada linha.
	 * 
	 */	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] vetorA = {1,0,5,-2,-5,7};
		int somaelementos = 0,i;
		
		System.out.println("Vetor A inicial: ");
		
		for (i = 0; i < vetorA.length;i++) {	
			System.out.print("\t " + vetorA[i]);
		}
		
		somaelementos = vetorA[0]+vetorA[1]+vetorA[5];
		System.out.println("\n\nA soma dos elementos nos indices 0,1 e 5 e: "+ somaelementos);
		vetorA[4] = 100;
		
		for (i = 0; i < vetorA.length;i++) {
			System.out.println("\n Elemento de indice "+ i + ": "+ vetorA[i]);
		}
		
		
	}

}

package aula3VetoresEMatriz;

import java.text.DecimalFormat;
import java.util.Scanner;

public class exemploArrayMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float[][] notas = new float [2][2];
		float somanotas = 0,mediageral;
		Scanner leia = new Scanner(System.in);
		int cont = 0,i,j;
		
		for(i = 0;i < 2;i++) {
			for(j = 0;j < 2;j++) {
				System.out.println("Entre com a nota");
				notas[i][j] = leia.nextFloat();
				somanotas = somanotas + notas[i][j];
				cont++;
				
				
			}
		}
		DecimalFormat df = new DecimalFormat("###.##");
		mediageral = somanotas / cont;
		System.out.println("\nMedia geral: "+ df.format(mediageral));
		
	}

}

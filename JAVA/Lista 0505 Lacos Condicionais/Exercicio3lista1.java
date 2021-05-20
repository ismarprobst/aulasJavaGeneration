package pacoteJava;

import java.util.Scanner;

public class Exercicio3lista1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int idade;
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\t\tCLASSIFICADOR DE CATEGORIA");
		System.out.println("Entre com sua idade");
		idade = leia.nextInt();
		
		if (idade >= 10 && idade <= 14) {
			
			System.out.println("Voce se encontra na categoria INFANTIL (10 A 14 ANOS)");
			
		}else if (idade >= 15 && idade <= 17) {
			
			System.out.println("Voce se encontra na categoria JUVENIL (15 A 17 ANOS)");
			
		}else if (idade >=18 && idade <=25) {
			
			System.out.println("Voce se encontra na categoria ADULTO (17 A 25 ANOS)");
			
		}else {
			
			System.out.println("Infelizmente voce se encontra FORA das categorias disponiveis");
			
		}
	}

}

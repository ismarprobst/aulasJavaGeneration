package aula2Repeticao;

import java.util.Scanner;

public class ex4lista2while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i = 1,idade, opcaoSexo,opcao2,pessoasCalmas = 0,mulheresNervosas = 0,homensAgressivos = 0,outrosCalmos = 0 ,pessoasNervosas40 = 0,pessoasCalmas18 = 0;
		Scanner leia = new Scanner(System.in);
		
		
		
		
		while (i <= 150) {
			System.out.println("Insira a idade: ");
			idade = leia.nextInt();
			System.out.println("Qual o sexo? \n1 - Feminino \n2 - Masculino \n3 - Outros ");
			opcaoSexo = leia.nextInt();
			System.out.println("Qual o perfil? \n1 - Calmo \n2 - Nervosa \n3 - Agressiva ");
			opcao2 = leia.nextInt();
			
			if (opcao2 == 1) {
				pessoasCalmas++;
			}
			if (opcaoSexo == 1 && opcao2 == 2) {
				mulheresNervosas++;
			}
			if (opcaoSexo == 2 && opcao2 == 3) {
				homensAgressivos++;
			}
			if (opcaoSexo == 3 && opcao2 == 1) {
				outrosCalmos++;
			}
			if (idade >= 40 && opcao2 == 2) {
				pessoasNervosas40++;
			}
			if (idade < 18 && opcao2 == 1) {
				pessoasCalmas18++;
			}				
			
			i++;
		}
		
		System.out.println("Total de pessoas calmas: "+pessoasCalmas);
		System.out.println("Total de mulheres nervosas: "+mulheresNervosas);
		System.out.println("Total de homens agressivos: "+homensAgressivos);
		System.out.println("Total de outros calmos: "+outrosCalmos);
		System.out.println("Total de pessoas nervosas acima de 40 anos: "+pessoasNervosas40);
		System.out.println("Total de pessoas calmas com menos de 18 anos: "+pessoasCalmas18);
		
	
	
	}

}

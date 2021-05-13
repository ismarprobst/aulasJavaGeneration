package tabela1105;

import java.util.ArrayList;
import java.util.Scanner;

public class AtividadeCollections {

	public static void main(String[] args) {


		int opcao;
		Scanner leia= new Scanner(System.in);
		
		ArrayList<String> estoque = new ArrayList();
		
		do 
		{
			System.out.println("\n-----------------------------------");
			System.out.println("\n1 - Deseja adicionar produtos ao estoque?");
			System.out.println("\n2 - Deseja remover produtos do estoque?");
			System.out.println("\n3 - Atualizar produtos do estoque?");
			System.out.println("\n4 - Mostrar todos os produtos do estoque?");
			System.out.println("\n0 - Deseja encerrar o programa?");
			System.out.println("\n Digite sua opcao: ");
			opcao = leia.nextInt();
		
			switch (opcao) 
			{
			case 1:
				leia.nextLine();//esvaziar o buffer de memoria
				System.out.println("\nDigite o produto para adicionar ao estoque: ");
				String produto = leia.nextLine();
				estoque.add(produto);
				break;
				
			case 2:
				leia.nextLine();
				System.out.println("\nDigite o produto para remover do estoque: ");
				String produto1 = leia.nextLine();
				if(estoque.contains(produto1))
				{
					estoque.remove(produto1);
				} else {
					System.out.println("\nProduto nao existe no estoque! :(");
				}
				break;
			case 3:
				System.out.println("\nDigite o produto que quer atualizar: ");
				String verifica = leia.nextLine();
				System.out.println("\n Digite o nome do produto que entrara no lugar de "+verifica+": ");
				String novo = leia.nextLine();
				if (estoque.contains(verifica)) {
					estoque.remove(verifica);
					estoque.add(novo);
				}else 
				{
					System.out.println("\nProduto nao existe no estoque! :(");
				}
				break;
			case 4:
				System.out.println("\nMostrando os produtos do estoque: \n");
				System.out.println(estoque);
				break;
				
			default:
				System.out.println("\n Finalizou o programa!");
			}
			
			
			
		}while(opcao != 0);

	}

}

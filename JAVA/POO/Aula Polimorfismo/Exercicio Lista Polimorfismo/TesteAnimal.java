package tabela1105;

public class TesteAnimal {
	public static void main(String[] args) {
		
		Preguica preguica1 = new Preguica("Soninho", 5);
		Cavalo cavalo1 = new Cavalo("Ligeiro", 8);
		Cachorro cachorro1 = new Cachorro("Fred",7);
		
		System.out.println("Nome do cachorro: "+ cachorro1.getNome());
		System.out.println("Nome do cavalo: "+ cavalo1.getNome());
		System.out.println("Nome da preguica: "+ preguica1.getNome());
		System.out.println("Idade do cachorro: "+ cachorro1.getIdade());
		System.out.println("Idade do cavalo: "+ cavalo1.getIdade());
		System.out.println("Idade da preguica: "+ preguica1.getIdade());
		
		
		cachorro1.emitirSom();
		cavalo1.emitirSom();
		preguica1.emitirSom();
		
		cachorro1.correr();
		cavalo1.correr();
		preguica1.subirArvore();
		
		
		
	}
	
}

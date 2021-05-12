package tabela1105;

public class Cachorro extends Animal{

		//Primeiro iriam os atributos especificos da subclasse
		//Depois o Metodo construtor
	public Cachorro(String nome, int idade) {
		super(nome, idade);//teria que entrar ainda com os this.atributo, mas nda neste caso
	}
	//GETTERS AND SETTERS dos atributos, como nao tem nenhum novo, Nada neste caso
	
	public void correr() {
		System.out.println("Cachorro esta correndo");
	}
	
	@Override
	public void emitirSom() {
		System.out.println("O cachorro esta emitindo o som: Au au au au au!");
	}
	
	
}

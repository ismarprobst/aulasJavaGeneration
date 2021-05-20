package AulasPoo;
/*
 * Crie uma classe paciente e apresente os atributos e métodos referentes esta classe,
 *  em seguida crie um objeto paciente, defina as instancias deste objeto e apresente
 *   as informações deste objeto no console.
 */


public class Paciente {
	private String nome;
	private int idade;
	private double peso;
	private double altura;
	private int nivelOxigenio;
	private int bpm;
	private String pressao;
	private String nivelUrgencia;
	private String comorbidades;
	
	public Paciente(String nome, int idade, double peso, double altura, int nivelOxigenio, int bpm, String pressao,
			String nivelUrgencia, String comorbidades) {
		this.nome = nome;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
		this.nivelOxigenio = nivelOxigenio;
		this.bpm = bpm;
		this.pressao = pressao;
		this.nivelUrgencia = nivelUrgencia;
		this.comorbidades = comorbidades;
	}
	
	
	
	public String getNome() {
		return nome;
	}



	public void setNome(String nome) {
		this.nome = nome;
	}



	public int getIdade() {
		return idade;
	}



	public void setIdade(int idade) {
		this.idade = idade;
	}



	public double getPeso() {
		return peso;
	}



	public void setPeso(double peso) {
		this.peso = peso;
	}



	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public int getNivelOxigenio() {
		return nivelOxigenio;
	}



	public void setNivelOxigenio(int nivelOxigenio) {
		this.nivelOxigenio = nivelOxigenio;
	}



	public int getBpm() {
		return bpm;
	}



	public void setBpm(int bpm) {
		this.bpm = bpm;
	}



	public String getPressao() {
		return pressao;
	}



	public void setPressao(String pressao) {
		this.pressao = pressao;
	}



	public String getNivelUrgencia() {
		return nivelUrgencia;
	}



	public void setNivelUrgencia(String nivelUrgencia) {
		this.nivelUrgencia = nivelUrgencia;
	}



	public String getComorbidades() {
		return comorbidades;
	}



	public void setComorbidades(String comorbidades) {
		this.comorbidades = comorbidades;
	}



	public void infos() {
		System.out.println("Ficha do Paciente:");
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Idade: "+ this.getIdade());
		System.out.println("Peso: "+ this.peso);
		System.out.println("Altura: "+ this.getAltura());
		System.out.println("Nivel Oxigenio: "+ this.getNivelOxigenio());
		System.out.println("Frequencia Cardiaca: "+ this.getPressao());
		System.out.println("Pressao: "+ this.getPressao());
		System.out.println("Comorbidades: "+ this.getComorbidades());
		System.out.println("Nivel de Urgencia: "+ this.getNivelUrgencia());
	}
	
	
	
}

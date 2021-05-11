package AulasPoo;
/*
 * Crie uma classe avião e apresente os atributos e métodos referentes esta classe,
 * em seguida crie um objeto avião, defina as instancias deste objeto e apresente as
 * informações deste objeto no console.
 */


public class Aviao {
	// atributos da classe
	private String modelo;
	private String marca;
	private String empresa;
	private int qtdadeMotores;
	private int capacidadePassageiros;
	private double cargaMaxima;
	// metodo construtor da classe
	public Aviao(String modelo, String marca,String empresa,int qtdadeMotores,int capacidadePassageiros, double cargaMaxima) 
	{
		this.modelo = modelo;
		this.marca = marca;
		this.empresa = empresa;
		this.qtdadeMotores = qtdadeMotores;
		this.capacidadePassageiros = capacidadePassageiros;
		this.cargaMaxima = cargaMaxima;
		
	}
	// metodos getters e setters da classe
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public int getQtdadeMotores() {
		return qtdadeMotores;
	}
	public void setQtdadeMotores(int qtdadeMotores) {
		this.qtdadeMotores = qtdadeMotores;
	}
	public int getCapacidadePassageiros() {
		return capacidadePassageiros;
	}
	public void setCapacidadePassageiros(int capacidadePassageiros) {
		this.capacidadePassageiros = capacidadePassageiros;
	}
	public double getCargaMaxima() {
		return cargaMaxima;
	}
	public void setCargaMaxima(double cargaMaxima) {
		this.cargaMaxima = cargaMaxima;
	}
	// Demais metodos da classe
	
	public void resumoInfo() {
		System.out.println("Empresa proprietaria: "+ empresa);
		System.out.println("Marca da aeronave: "+ marca);
		System.out.println("Modelo da aeronave: "+ modelo);
		System.out.println("Quantidade de motores: "+ qtdadeMotores);
		System.out.println("Capacidade de passageiros: "+ capacidadePassageiros);
		System.out.println("Capacidade de carga maxima: "+ cargaMaxima);
	}
	
	
	
	
}

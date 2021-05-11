package AulasPoo;

public class TesteAviao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//instanciando o primeiro objeto
		Aviao aviao1 = new Aviao("A330-900neo","Airbus","Azul",2,298,70000);
		
		//metodo para imprimir dados
		
		aviao1.resumoInfo();
		System.out.println("----TRANSFERINDO PROPRIEDADE DE AERONAVE----");
		aviao1.setEmpresa("Latam");
		System.out.println("----ALTERANDO CONFIGURACAO DE POLTRONAS----");
		aviao1.setCapacidadePassageiros(315);
		System.out.println("Novos dados:");
		aviao1.resumoInfo();
		
		
		
	}

}

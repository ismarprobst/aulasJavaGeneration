package AulasPoo;

public class TestePaciente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Paciente paciente1 = new Paciente("Joao",56,78.0,1.73,92,105,"10/8","Urgencia","Diabetico");
		
		System.out.println("Imprimindo dados do paciente...");
		paciente1.infos();
	}

}

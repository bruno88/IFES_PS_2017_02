
public class Principal {

	public static void main(String[] args) {
		String nome = "Bruno", CPF = "1234";
		String nomeEmp = "IFES";
		int idade = 28;
		double altura = 0, peso = 0;
		Endereco endComercial = null, endResidencial;
		Pessoa p1 = new Pessoa(nome, CPF, idade, altura, peso, endComercial);
		Empresa e1 = new Empresa(nomeEmp);
		Emprego emprego = new Emprego(p1, e1);
		System.out.println(emprego.imprimir());

		/*
		 * int numRodas = 3; double altitudeMax = 100.8; VeiculoAereo aviao1 = new
		 * VeiculoAereo(numRodas, altitudeMax);
		 */
		int numRodas = 0;
		double profundidade = 30.0;
		VeiculoMaritmo barco1 = 
				new VeiculoMaritmo(numRodas, profundidade);
	}

}

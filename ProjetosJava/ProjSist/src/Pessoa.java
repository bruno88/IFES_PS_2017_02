
public class Pessoa {
	String nome, CPF;
	int idade;
	double altura, peso;
	Endereco endComercial, endResidencial;

	Pessoa(String nome, String CPF, int idade, double altura, double peso, Endereco endComercial) {
		this.nome = nome;
		this.CPF = CPF;
		this.idade = idade;
		this.altura = altura;
		this.peso = peso;
		this.endComercial = endComercial;
	}

	public Pessoa(Object nome2, Object cPF2, int idade2, int altura2, int peso2, Object endComercial2) {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public String getCPF() {
		return this.CPF;
	}

	public void setCPF(String CPF) {
		this.CPF = CPF;
	}
}

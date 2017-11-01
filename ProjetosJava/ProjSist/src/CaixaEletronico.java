
public class CaixaEletronico {
	Conta c1 = new Conta();
	
	public void saque (Conta conta, double valor,
			double limite) {
		conta.subtrairSaldo(valor, limite);
	}
}

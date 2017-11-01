import java.util.HashMap;

public class Emprego {
	HashMap<Pessoa, Empresa> empregos =
			new HashMap<Pessoa, Empresa>();

	public Emprego(Pessoa p1, Empresa e1) {
		empregos.put(p1, e1);
	}

	public String imprimir() {
		String result = "";
		for (Pessoa p1 : empregos.keySet()) {

			String key = p1.getNome();
			String value = empregos.get(p1).getNome();
			result += key + " - " + value;

		}
		return result;
	}
}

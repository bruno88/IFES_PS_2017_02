import java.util.ArrayList;

public class Andar {
	private ArrayList<Sala> salas;

	public Andar () {
		salas = new ArrayList<Sala>();
	}
	
	public void inserirSala(Sala s1) {
		this.salas.add(s1);
	}

	public void removerSala(Sala s1) {
		this.salas.remove(s1);
	}
}

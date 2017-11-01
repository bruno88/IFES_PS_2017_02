import java.util.ArrayList;

public class Sala {
	private ArrayList<Mesa> mesas = new ArrayList<Mesa>();

	public void inserirMesa(Mesa m1) {
		this.mesas.add(m1);
	}

	public void removerMesa(Mesa m1) {
		this.mesas.remove(m1);
	}
}

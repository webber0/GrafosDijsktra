package code;
//Equivalente a la arista
public class Camino {
	public final Claro objetivo;
	public final double peso;
	public Camino(Claro objetivo, double peso) {
		this.objetivo=objetivo;
		this.peso=peso;
	}
}
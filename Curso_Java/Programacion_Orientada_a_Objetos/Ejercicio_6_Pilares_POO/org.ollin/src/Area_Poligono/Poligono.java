package Area_Poligono;

public abstract class Poligono {
	protected int numeroLados;

	public Poligono(int numeroLados) {
		super();
		this.numeroLados = numeroLados;
	}

	public int getNumeroLados() {
		return numeroLados;
	}

	@Override
	public String toString() {
		return "Numero Lados = " + numeroLados ;
	}
	
	//Declaramos el metodo área como abstracto
	public abstract double area();
	
}

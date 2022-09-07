package Triangulo;

public class Triangulo_Isosceles {
	private double base;
	private double lado;
	
	public Triangulo_Isosceles(double base, double lado) {
		this.base=base;
		this.lado=lado;
	}
	
	public double ObPerimetro() {
		double perimetro=2*lado+base;
		return perimetro;
	}
	
	public double ObArea() {
		double area=(base*Math.sqrt((lado*lado)-((base*base)/4)))/2;
		return area;
	}
	
	public String mostrarDatos() {
		return "Base: "+base+"\nLado: "+lado+"\nPerimetro: "+ObPerimetro()+"\nArea: "+ObArea()+"\n";
	}
}

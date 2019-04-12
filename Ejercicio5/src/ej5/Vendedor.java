package ej5;

public class Vendedor extends Empleado{
	private double porcenComision;
	private double totalVentas;
	
	public Vendedor(int dni, String nombre, String apellido, String email, double sueldoBase, double porcenComision,
			double totalVentas) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.porcenComision = porcenComision;
		this.totalVentas = totalVentas;
	}
	public double getPorcenComision() {
		return porcenComision;
	}
	public double getTotalVentas() {
		return totalVentas;
	}
	
	public double getSueldo() {
		return this.getSueldoBase()+(this.getPorcenComision()*this.getTotalVentas()/100);
	}
}

package ej5;

public class Administrativo extends Empleado{
	private double hsExtra;
	private double hsMes;
	
	
	public Administrativo(int dni, String nombre, String apellido, String email, double sueldoBase, double hsExtra,
			double hsMes) {
		super(dni, nombre, apellido, email, sueldoBase);
		this.hsExtra = hsExtra;
		this.hsMes = hsMes;
	}
	public double getHsMes() {
		return hsMes;
	}
	public double getHsExtra() {
		return hsExtra;
	}
	public double getSueldo() {
		return this.getSueldoBase()*((this.getHsMes()*1.5)+this.getHsMes())/this.getHsMes();
	}
	

}

package ej5;

import java.util.Scanner;

public class Principal {
	static Empleado[] empleados = new Empleado[20];
	public static void crearEmpleados() {
		for(int i = 0; i<20;i++) {
			System.out.println("El empleado numero "+(i+1)+" es vendedor(v) o es administrativo(a)");
			Scanner sc = new Scanner(System.in);
			String resp = sc.nextLine();
			/*String nombre = "gonzalo";
			String apellido = "monja";
			int dni = 40984288;
			String email = "gonzalormonja1@gmail.com";
			double sueldoBase = 235.50;*/
			System.out.println("Ingrese el nombre del empleado");
			String nombre = sc.nextLine();

			System.out.println("Ingrese el apellido del empleado");
			String apellido = sc.nextLine();

			System.out.println("Ingrese el DNI del empleado");
			int dni = sc.nextInt();

			System.out.println("Ingrese el email del empleado");
			String email = sc.nextLine();

			System.out.println("Ingrese el sueldoBase del empleado");
			double sueldoBase = sc.nextDouble();
			
			if(resp.equalsIgnoreCase("v")){
				/*
				double porcenComision = 10.5;
				double totalVentas = 0;
				*/
				System.out.println("Ingrese el sueldoBase del empleado");
				double porcenComision = sc.nextDouble();
				System.out.println("Ingrese el sueldoBase del empleado");
				double totalVentas = sc.nextDouble();
				Vendedor vend = new Vendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
				empleados[i]=vend;
			}else {
				/*double hsExtra = 5;
				double hsMes = 30;*/
				System.out.println("Ingrese las horass Extra del empleado");
				double hsExtra = sc.nextDouble();
				System.out.println("Ingrese las horas del mes del empleado");
				double hsMes = sc.nextDouble();
				Administrativo adm = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);
				empleados[i]=adm;
			}
		}
	}
	public static void mostrarEmplados() {
		for(int i = 0;i<empleados.length;i++) {
			System.out.println("Empleado n°"+(i+1));
			System.out.println("DNI: "+empleados[i].getDni());
			System.out.println("Nombre y apellido: "+empleados[i].getNombre()+" "+empleados[i].getApellido());
			System.out.println("Sueldo "+empleados[i].getSueldo());
		}
	}
	public static void main(String[] args) {
		crearEmpleados();
		mostrarEmplados();
	}

}

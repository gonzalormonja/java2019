package ej5;

import java.util.Scanner;

public class Principal {
	public static void main(String[] args) {
		Empleado[] empleados = new Empleado[20];
		for(int i = 0; i<20;i++) {
			System.out.println("El empleado numero "+(i+1)+" es vendedor(v) o es administrativo(a)");
			Scanner sc = new Scanner(System.in);
			String resp = sc.nextLine();
			String nombre = "gonzalo";
			String apellido = "monja";
			int dni = 40984288;
			String email = "gonzalormonja1@gmail.com";
			double sueldoBase = 235.50;
			if(resp.equalsIgnoreCase("v")){
				double porcenComision = 10.5;
				double totalVentas = 0;
				Vendedor vend = new Vendedor(dni, nombre, apellido, email, sueldoBase, porcenComision, totalVentas);
				empleados[i]=vend;
			}else {
				double hsExtra = 5;
				double hsMes = 30;
				Administrativo adm = new Administrativo(dni,nombre,apellido,email,sueldoBase,hsExtra,hsMes);
				empleados[i]=adm;
			}
		}
		
		//mostramos los empleados
		for(int i = 0;i<empleados.length;i++) {
			System.out.println("Empleado n�"+(i+1));
			System.out.println("DNI: "+empleados[i].getDni());
			System.out.println("Nombre y apellido: "+empleados[i].getNombre()+" "+empleados[i].getApellido());
			System.out.println("Sueldo "+empleados[i].getSueldo());
		}
	}

}

package EJERCICIO1;

/*
1. Crear una clase Empleado con las siguientes propiedades:
		int id;
		String nombre;
		int edad;


2. Aplicar el concepto de encapsulación dentro de la clase Empleado

*/
public class Empleado {
	private int id;
	private String nombre;
	private int edad;
	
	public int getId() {
		return id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
}



package Universidad;

import java.util.ArrayList;
import Universidad.Profesor;
import Universidad.Estudiante;

public class Departamento {
	private String nombre;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	public Administrativo unnamed_Administrativo_;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento(String nombre) {
		this.nombre=nombre;
	}

	public void mostrarPersonal() {
		throw new UnsupportedOperationException();
	}
}
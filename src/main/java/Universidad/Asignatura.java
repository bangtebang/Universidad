package Universidad;

import java.util.ArrayList;
import Universidad.Estudiante;

public class Asignatura {
	private String codigoAsignatura;
	private String nombre;
	private Profesor profesor;
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();

	public String getCodigoAsignatura() {
		return this.codigoAsignatura;
	}

	public void setCodigoAsignatura(String codigoAsignatura) {
		this.codigoAsignatura = codigoAsignatura;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Asignatura(String codigoAsignatura,String nombre) {
		this.codigoAsignatura=codigoAsignatura;
		this.nombre=nombre;
	}

	public void buscarEstudiantes() {
		throw new UnsupportedOperationException();
	}

	public void buscarProfesor() {
		throw new UnsupportedOperationException();
	}
}
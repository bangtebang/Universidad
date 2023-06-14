package Universidad;

import java.util.ArrayList;
import Universidad.Estudiante;

public class Asignatura {
	private String codigoAsignatura;
	private String nombre;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
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

	public Estudiante buscarEstudiantes(String nombre,String run,String estadoCivil,String carrera,int anoIngreso) {
		for (Estudiante estudiante : estudiantes) {
			if (estudiante.getNombre().equals(nombre) && estudiante.getRun().equals(run) &&estudiante.getEstadoCivil().equals(estadoCivil)&&estudiante.getCarrera().equals(carrera)&&estudiante.getAnoIngreso()==(anoIngreso)) {
				return estudiante;
			}
		}
		return null;
	}

	public Profesor buscarProfesor(String nombre,String run,String estadoCivil,int anoIncorporacion) {
		for (Profesor profesor : profesores) {
			if (profesor.getNombre().equals(nombre)&&profesor.getRun().equals(run) &&profesor.getEstadoCivil().equals(estadoCivil)&&profesor.getAnoIncorporacion()==(anoIncorporacion)) {
				return profesor;
			}
		}
		return null;
	}
}
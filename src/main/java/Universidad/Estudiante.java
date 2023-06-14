package Universidad;

import java.util.ArrayList;
import Universidad.Asignatura;

public class Estudiante extends Persona {
	private int anoIngreso;
	private String carrera;
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();

	public int getAnoIngreso() {
		return this.anoIngreso;
	}

	public void setAnoIngreso(int anoIngreso) {
		this.anoIngreso = anoIngreso;
	}

	public String getCarrera() {
		return this.carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public Estudiante(String nombre, String run,String estadoCivil,String carrera,int anoIngreso ) {
		super(nombre, run,estadoCivil);
		this.carrera=carrera;
		this.anoIngreso=anoIngreso;
	}
}
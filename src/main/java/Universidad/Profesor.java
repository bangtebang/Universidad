package Universidad;

import java.util.ArrayList;
import Universidad.Asignatura;
import Universidad.Departamento;

public class Profesor extends PersonalContratado {
	private ArrayList<Asignatura> asignaturas = new ArrayList<Asignatura>();
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Profesor(String nombre, String run,String estadoCivil,int anoIncorporacion) {
		super(nombre, run,estadoCivil,anoIncorporacion);
	}
}
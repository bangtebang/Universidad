package Universidad;

import java.util.ArrayList;

public class Administrativo extends PersonalContratado {
	private ArrayList<Departamento> departamentos = new ArrayList<Departamento>();

	public Administrativo(String nombre, String run,String estadoCivil,int anoIncorporacion) {
		super(nombre, run,estadoCivil,anoIncorporacion);
	}
}
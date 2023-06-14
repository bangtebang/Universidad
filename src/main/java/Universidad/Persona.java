package Universidad;

public class Persona {
	private String nombre;
	private String run;
	private String estadoCivil;

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getRun() {
		return this.run;
	}

	public void setRun(String run) {
		this.run = run;
	}

	public String getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(String estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	public Persona(String nombre,String run,String estadoCivil) {
		this.nombre=nombre;
		this.estadoCivil=estadoCivil;
		this.run=run;
	}
}
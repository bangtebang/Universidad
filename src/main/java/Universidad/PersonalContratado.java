package Universidad;

public class PersonalContratado extends Persona {
	private int anoIncorporacion;

	public int getAnoIncorporacion() {
		return this.anoIncorporacion;
	}

	public void setAnoIncorporacion(int anoIncorporacion) {
		this.anoIncorporacion = anoIncorporacion;
	}

	public PersonalContratado(String nombre, String run,String estadoCivil,int anoIncorporacion) {
		super(nombre, run,estadoCivil);
		this.anoIncorporacion=anoIncorporacion;
	}
}
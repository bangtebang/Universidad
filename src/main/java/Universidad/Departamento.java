package Universidad;

import java.util.ArrayList;
import java.util.PropertyPermission;

import Universidad.Profesor;
import Universidad.Estudiante;

public class Departamento {
	private String nombre;
	private ArrayList<Profesor> profesores = new ArrayList<Profesor>();
	private ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
	private ArrayList<Administrativo> administrativos = new ArrayList<Administrativo>();

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}
	public ArrayList<Administrativo> getAdministrativos() {
		return administrativos;
	}


	public ArrayList<Estudiante> getEstudiantes() {
		return estudiantes;
	}

	public Departamento(String nombre) {
		this.nombre=nombre;
		this.administrativos=new ArrayList<>();
		this.profesores=new ArrayList<>();
		this.estudiantes=new ArrayList<>();

	}
	public void mostrarPersonal() {
		System.out.println(nombre);
		System.out.println("Profesores: " );
		for (Profesor profesor : profesores) {
			System.out.println(profesor.getNombre());
		}
		System.out.println("Estudiantes: " );
		for (Estudiante estudiante : estudiantes) {
			System.out.println(estudiante.getNombre());
		}
		System.out.println("Administrativos: ");
		for (Administrativo administrativo : administrativos) {
			System.out.println(administrativo.getNombre());
		}
	}
	public void agregarProfesor(Profesor profesor) {
		profesores.add(profesor);
	}

	public void agregarEstudiante(Estudiante estudiante) {
		estudiantes.add(estudiante);
	}
	public void agregarAdministrativo(Administrativo administrativo) {
		administrativos.add(administrativo);
	}


}

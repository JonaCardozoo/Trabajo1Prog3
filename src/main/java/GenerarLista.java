import com.github.javafaker.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Locale;

public class GenerarLista {
	Faker faker;
	// Variables
	private static int LimitAlumnos = 50;
	private static int LimitProfesor = 20;
	int contador = 0;
	double Acum = 0;

	private static String[] profesiones = { "Ing.Sistemas", "Lic.Sistemas", "Desarrollador" };

	public GenerarLista() {
		this.faker = new Faker(new Locale("es"));
	}

	public List<Persona> getListaAlumnos() {
		List<Persona> listaAlumno = new ArrayList<Persona>();

		for (int i = 0; i < LimitAlumnos; i++) {
			int edad = faker.number().numberBetween(20, 40);
			long dni = faker.number().numberBetween(30000000, 50000000);
			String nombre = faker.name().firstName();
			String Apellido = faker.name().lastName();
			int numLE = faker.number().numberBetween(1000, 5000);
			int materiasAprobadas = faker.number().numberBetween(1, 40);
			Double promedio = faker.number().randomDouble(3, 1, 10);
			Acum += promedio;
			listaAlumno.add(new Alumno(i + 1, nombre, Apellido, edad, dni, numLE, materiasAprobadas, promedio));
			
		}

		listaAlumno.sort(null);
		return listaAlumno;

	}

	public List<Persona> getListaProfesor() {
		List<Persona> listaProfesor = new ArrayList<Persona>();
		for (int i = 0; i < LimitProfesor; i++) {
			int legajo = faker.number().numberBetween(20000, 40000);
			String titulo = profesiones[faker.number().numberBetween(0, profesiones.length)];
			String Apellido = faker.name().lastName();
			String nombre = faker.name().lastName();
			int edad = faker.number().numberBetween(20, 40);
			long dni = faker.number().numberBetween(30000000, 40000000);

			listaProfesor.add(new Profesor(i + 1, Apellido, nombre, edad, dni, legajo, titulo));

		}
		listaProfesor.sort(null);
		return listaProfesor;

	}

	public Alumno obtenerAlumnoConMayorPromedio(List<Persona> lista) {
		Alumno alumnoConMayorPromedio = null;
		double promedioMaximo = -1;

		for (Persona persona : lista) {
			if (persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				if (alumno.getPromedio() > promedioMaximo) {
					promedioMaximo = alumno.getPromedio();
					alumnoConMayorPromedio = alumno;
				}
			}
		}

		return alumnoConMayorPromedio;
	}

	public Alumno obtenerAlumnoConMenorPromedio(List<Persona> lista) {
		Alumno alumnoConMenorPromedio = null;
		double promedioMinimo = Double.MAX_VALUE;

		for (Persona persona : lista) {
			if (persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				if (alumno.getPromedio() < promedioMinimo) {
					promedioMinimo = alumno.getPromedio();
					alumnoConMenorPromedio = alumno;
				}

			}

		}

		return alumnoConMenorPromedio;
	}

	public List<Persona> obtenerAlumnosPromedioMayorA7(List<Persona> listaPersonas) {
		List<Persona> alumnosPromedioMayorA7 = new ArrayList<>();

		for (Persona persona : listaPersonas) {
			if (persona instanceof Alumno && ((Alumno) persona).getPromedio() > 7) {
				alumnosPromedioMayorA7.add(persona);
				contador++;

			}

		}

		alumnosPromedioMayorA7.sort(Comparator.comparingDouble(alumno -> ((Alumno) alumno).getPromedio()).reversed());

		return alumnosPromedioMayorA7;
	}

	public List<Persona> obtenerProfesoresIngSis(List<Persona> lista) {
		List<Persona> listaProfeIngSis = new ArrayList<Persona>();

		for (Persona persona : lista) {
			if (persona instanceof Profesor) {
				Profesor profe = (Profesor) persona;
				if (profe.getTitulo().equals("Ing.Sistemas")) {
					listaProfeIngSis.add(profe);
				}
			}

		}
		return listaProfeIngSis;
	}

	public void ordenarYMostrarProfesoresPorEdad(List<Persona> lista) {

		Collections.sort(lista, Comparator.comparingInt(Persona::getEdad).reversed());

		for (Persona persona : lista) {
			if (persona instanceof Profesor) {
				Profesor profe = (Profesor) persona;
				System.out.println(profe.toString());
			}

		}
	}

	public int MostrarEdad(List<Persona> lista) {
		int AcumularEdad = 0;

		for (Persona persona : lista) {
			if (persona instanceof Profesor) {
				Profesor profe = (Profesor) persona;
				AcumularEdad += profe.getEdad();
			}
		}

		return AcumularEdad;
	}

	public double PromedioTotal(List<Persona> listaAlumnos) {
		double sumaTotal = 0;

		for (Persona persona : listaAlumnos) {
			if (persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				sumaTotal += alumno.getPromedio();
			}

		}
		return sumaTotal / listaAlumnos.size();
	}

	public double PromedioTotalM7(List<Persona> listaAlumnos) {
		double sumaMejores = 0;
		int cantidadMejores = 0;
		for (Persona persona : listaAlumnos) {
			if (persona instanceof Alumno) {
				Alumno alumno = (Alumno) persona;
				if (alumno.getPromedio() > 7) {
					sumaMejores += alumno.getPromedio();
					cantidadMejores++;
				}
			}
		}
		if (cantidadMejores == 0) {
			return 0;
		} else {
			return sumaMejores / cantidadMejores;
		}
	}
}

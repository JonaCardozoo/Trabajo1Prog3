import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		GenerarLista generar = new GenerarLista();
		
		List<Persona> listaPersona = new ArrayList<Persona>();
		
		listaPersona.addAll(generar.getListaAlumnos());
		listaPersona.addAll(generar.getListaProfesor());
		
		
		System.out.println(listaPersona);
		System.out.println("--MAYOR PROMEDIO--");
		System.out.println(generar.obtenerAlumnoConMayorPromedio(listaPersona));
		System.out.println("--MENOR PROMEDIO--");
		System.out.println(generar.obtenerAlumnoConMenorPromedio(listaPersona));
		System.out.println("--ALUMNOS CON PROMEDIO MAYOR A 7--");
		System.out.println(generar.obtenerAlumnosPromedioMayorA7(listaPersona));
		System.out.println("--PROFESORES INGENIEROS EN SISTEMAS--");
		System.out.println(generar.obtenerProfesoresIngSis(listaPersona));
		System.out.println("--PROFESORES POR EDAD--");
		generar.ordenarYMostrarProfesoresPorEdad(listaPersona);
		System.out.println("--SUMA DE EDADES DE PROFESORES--");
		System.out.println(generar.MostrarEdad(listaPersona));
		System.out.println("--PROMEDIO TOTAL--");
		System.out.println(generar.PromedioTotal(listaPersona));
		System.out.println("--PROMEDIO MEJORES NOTAS--");
		System.out.println(generar.PromedioTotalM7(listaPersona) );
	}

}

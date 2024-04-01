import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
GenerarLista generar = new GenerarLista();
        
        List<Persona> listaAlumnos = new ArrayList<>();
        List<Persona> listaProfesores = new ArrayList<>();
        
        listaAlumnos.addAll(generar.getListaAlumnos());
        listaProfesores.addAll(generar.getListaProfesor());
        
        System.out.println("--PUNTO A, ALUMNOS ORDENADOS POR APELLIDO, SI SE REPITE, ORDENADOS APELLIDO Y NOMBRE--");
        System.out.println(" ");
        System.out.println("Lista de Alumnos:");
        System.out.println(listaAlumnos);
        System.out.println(" ");
        System.out.println("--PUNTO B, PROFESORES ORDENADOS POR LEGAJO--");
        System.out.println(" ");
        System.out.println("Lista de Profesores:");
        System.out.println(listaProfesores);
        System.out.println("--PUNTO C - IDENTIFICAR EL MAYOR PROMEDIO DE TODA LA LISTA--");
        System.out.println(generar.obtenerAlumnoConMayorPromedio(listaAlumnos));
        System.out.println(" ");
        System.out.println("--PUNTO D - IDENTIFICAR EL MENOR PROMEDIO DE TODA LA LISTA--");
        System.out.println(generar.obtenerAlumnoConMenorPromedio(listaAlumnos));
        System.out.println(" ");
        System.out.println("--PUNTO E - ALUMNOS CON PROMEDIO MAYOR A 7--");
        System.out.println(generar.obtenerAlumnosPromedioMayorA7(listaAlumnos));
        System.out.println(" ");
        System.out.println("--PUNTO F - IDENTIFICAR PROFESORES INGENIEROS EN SISTEMAS--");
        System.out.println(generar.obtenerProfesoresIngSis(listaProfesores));
        System.out.println(" ");
        System.out.println("--PUNTO G - ORDENAR PROFESORES POR EDAD--");
        generar.ordenarYMostrarProfesoresPorEdad(listaProfesores);
        System.out.println(" ");
        System.out.println("--PUNTO H - SUMA DE EDADES DE TODOS LOS PROFESORES--");
        System.out.println(generar.MostrarEdad(listaProfesores));
        System.out.println(" ");
        System.out.println("-- PUNTO I - PROMEDIO TOTAL Y PROMEDIO MEJORES NOTAS--");
        System.out.println(generar.PromedioTotal(listaAlumnos));
        System.out.println(" ");
        System.out.println("-- PUNTO I - PROMEDIO MEJORES NOTAS--");
        System.out.println(generar.PromedioTotalM7(listaAlumnos) );
    }

}

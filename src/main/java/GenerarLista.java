import com.github.javafaker.*;
import java.lang.reflect.Array;
public class GenerarLista {
 Faker faker;
 private static int LimitAlumnos = 25;
 private static int LimitProfesor = 50;
 
 private static String[] profesiones = {"Ing.Sistemas","Lic.Sistemas","Desarrollador"};
 
 
 public GenerarLista() {
  this.faker = new Faker();
 }
 
 public List<Alumno> getListaAlumnos(){
  List<Alumno> listaAlumno = new ArrayList<>();
  for (int i = 0; i < LimitAlumnos; i++) {
   int edad = faker.number().numberBetween(20, 40);
   long dni = faker.number().numberBetween(30000000, 50000000);
   String nombre = faker.name().firstName();
   String Apellido = faker.name().lastName();
   int numLE = faker.number().numberBetween(1000, 5000);
   int materiasAprobadad = faker.number().numberBetween(1, 40);
   Double promedio = faker.number().randomDouble(3, 1, 10);
   listaAlumno.add(new Alumno(i+1,nombre,apellido,edad,dni,nroLE,materiasAprobadas,promedio));
   
      
  }
  return listaAlumnos;
 }
 
}

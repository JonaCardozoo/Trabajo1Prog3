
public class Alumno extends Persona implements Comparable<Alumno> {

	@Override
	public String toString() {
		return "[ ID = " + Id +  " - Edad= " + Edad + " - Dni= " + Dni + " - Nombre= " + Nombre + " - Apellido= " + Apellido + " - numLE= " + numLE + " - materiasAprobadas= " + materiasAprobadas + " - Promedio= " + Promedio + "]" + "\n";

	}
	int Edad;
	long Dni;
	String Nombre;
	String Apellido;
	int numLE;
	int materiasAprobadas;
	Double Promedio;
	
	public int getEdad() {
		return Edad;
	}

	public void setEdad(int edad) {
		Edad = edad;
	}

	public long getDni() {
		return Dni;
	} 

	public void setDni(long dni) {
		Dni = dni;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public int getNumLE() {
		return numLE;
	}

	public void setNumLE(int numLE) {
		this.numLE = numLE;
	}

	public int getMateriasAprobadas() {
		return materiasAprobadas;
	}

	public void setMateriasAprobadas(int materiasAprobadas) {
		this.materiasAprobadas = materiasAprobadas;
	}

	public Double getPromedio() {
		return Promedio;
	}

	public void setPromedio(Double promedio) {
		Promedio = promedio;
	}
	
	public Alumno(int id,String nombre, String apellido, int edad,long dni,int numLE, int materiasAprobadas,Double promedio) {
		super(id, apellido, nombre, edad, dni);
		Edad = edad;
		Dni = dni;
		Nombre = nombre;
		Apellido = apellido;
		this.numLE = numLE;
		this.materiasAprobadas = materiasAprobadas;
		Promedio = promedio;
	}
	
	
	public int compareTo(Alumno alum) {
		//comparar por apellido
		int comparacion = this.Apellido.compareTo(alum.getApellido());
		
		if(comparacion!=0) {
			return comparacion;
		}
		
		if(comparacion ==0) {
			//comparar por nombre por si se repite el apellido
			return this.Nombre.compareTo(alum.Nombre);
		}
		return Integer.compare(this.Edad,alum.getEdad());
		
	}
	
}

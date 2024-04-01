
public class Profesor extends Persona implements Comparable<Profesor>  {
	
	int Legajo;
	String Titulo;
	
	
	public int getLegajo() {
		return Legajo;
	}


	public void setLegajo(int legajo) {
		Legajo = legajo;
	}


	public String getTitulo() {
		return Titulo;
	}

	public void setTitulo(String titulo) {
		Titulo = titulo;
	}


	public Profesor(int id, String apellido, String nombre, int edad, long dni,int legajo,String titulo) {
		super(id, apellido, nombre, edad, dni);
		Legajo = legajo;
		Titulo = titulo;
		
	}
	
	public int compareTo(Profesor profe) {
		 return Integer.compare(profe.Legajo, this.Legajo);
		
	}

	@Override
	public String toString() {
		return "[ ID = " + Id  + "  Profesor: Nombre =  " + Nombre + " -  Apellido = " + Apellido +  " - Legajo= " + Legajo + " -  Titulo=  " + Titulo +  " -  Edad= "+ Edad + "]" + "\n";
	}
	
}

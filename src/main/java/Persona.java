
public class Persona {

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getApellido() {
		return Apellido;
	}

	public void setApellido(String apellido) {
		Apellido = apellido;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

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

	int Id;
	String Apellido;
	String Nombre;
	int Edad;
	long Dni;

	public Persona(int id, String apellido, String nombre, int edad, long dni) {

		Id = id;
		Apellido = apellido;
		Nombre = nombre;
		Edad = edad;
		Dni = dni;
	}

	@Override
	public String toString() {
		return "Persona Id= " + Id + "- Apellido= " + Apellido + "- Nombre= " + Nombre + "- Edad= " + Edad + "- Dni= "
				+ Dni + "/n";
	}
}

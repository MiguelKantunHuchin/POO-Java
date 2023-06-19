package entidades;

//Primero se da la instruccion de que se quiere heredr
public class Empleado extends Persona {

	// Atributos

	public String numEmpleado;
	public String nss;
	public String puesto;

	// Constructor

	public Empleado(String nombre, int edad, String correo, String telefono, String numEmpleado, String nss,
			String puesto) {
		super(nombre, edad, correo, telefono);
		this.numEmpleado = numEmpleado;
		this.nss = nss;
		this.puesto = puesto;
	}
	
	// Metodo para imprimir informacion de empleado
	public void mostrarInformacion() {
		
		 System.out.println("Nombre: " + nombre);
         System.out.println("Edad: " + edad);
         System.out.println("Correo: " + correo);
         System.out.println("Telefono: " + telefono);
         System.out.println("Numero Empleado: " + numEmpleado);
         System.out.println("Numero Seguro Social: " + nss);
         System.out.println("Puesto: " + puesto);
		
	}
}

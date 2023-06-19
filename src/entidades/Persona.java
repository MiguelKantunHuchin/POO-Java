package entidades;

public class Persona {
	
	// 1- Propiedades o atributos
	
	public String nombre;
	public int edad;
	public String correo;
	public String telefono;
	
	// 2- Constructor
	
	public Persona(String nombre, int edad, String correo, String telefono) {
		this.nombre = nombre;
		this.edad = edad;
		this.correo = correo;
		this.telefono = telefono;
			
	}//aqui termina el constructor
	
	
	  //Sobrecarga de metodo (overloading) constructor con 3
    public Persona(String nombre, int edad, String correo) {
        this.nombre = nombre;
        this.edad = edad;
        this.correo = correo;
    }
    

    //Sobrecarga de metodo (overloading) constructor con 2 
    public Persona(String nombre, int edad) {
        this.nombre = nombre;            
        this.edad = edad;
    }
	
	// 3- Metodos
	
	public void mostrarInformacion(){
		System.out.println("Nombre: " + nombre);
		System.out.println("Edad: " + edad);
		System.out.println("Correo: " + correo);
		System.out.println("Telefono: " + telefono);			
	}// aqui termina el metodo mostrarInfo
	
	

    

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		//instancia de clase Persona
		
		Persona Miguel = new Persona("Miguel", 24, "miguelkh21@gmail.com", "9995955376");
		Persona Jose = new Persona("Jose", 20, "josesito@gmail.com", "123456789");
		Persona Angel = new Persona("Angel", 28, "angelito@gmail.com", "934536234");
		Persona Andres = new Persona("Andres", 24, "andresito@gmail.com", "876543456");
		Persona Pedro = new Persona("Pedro", 24, "pedrito@gmail.com", "54231978");

		Miguel.mostrarInformacion();
		System.out.println("");
		Pedro.mostrarInformacion();
		System.out.println("");
		Jose.mostrarInformacion();
		System.out.println("");
		Angel.mostrarInformacion();
		System.out.println("");
		Andres.mostrarInformacion();
		
	}// cierre del main

} //cierre de la clase Persona

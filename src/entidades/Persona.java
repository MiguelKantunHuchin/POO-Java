package entidades;

public class Persona {
	
	/*
	 * Notas para trabajar con POO en JAVA
	 * 
	 * Establecemos los pasos para trabajar con nuestras clases, definiendo el siguiente orden:
	 * 
	 *  - Primero nuestras propiedades o atributos usando variables de JAVA
	 *  
	 *  - Definimos un constructor con parametros (este constructor se define en la clase). Tambien tenemos un constructor llamado "constructor por defecto", que se define en la instancia de la clase. El inconveniente que tenemos es que solo podemos usar uno de los dos.
	 *  
	 *  - Por ultimo, definimos los metodos que nuestro objeto va a utilizar. Aqui utilizamos la teoria de funciones (funciones vacias, funciones que retornar un tipo de valor).
	 *  
	 *  
	 *  
	 *  Notas adicionales
	 *  
	 *  Sobrecarga de metodos.
	 *  
	 *  La finalidad de la sobrecarga de metodos es utilizar el mismo nombre del metodo (Persona) e ir variando sus parametros. Con esto evitamos usar "Persona1", "Persona2", etc. para utilizar el mismo metodo.
	 *  
	 *  Hay que recordar que los datos generalmente vienen del front (formulario). La sobrecarga nos ayuda en comprender distintas situaciones donde tal vez uno de los campos solicitados en el formulario no sea requerido u obligatorio de llenar. Utilizando la sobrecarga, evitamos que el dato se asigne incorrectamente (es decir, que quede como indefinido), ya que esto podria acarrear errores en la ejecucion de nuestro codigo. De preferencia, es mejor que el dato quede como nulo.  
	 *  
	 * 
	 */
	
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

package entidades;

public class Test {
	public static void main(String[] args) {
		
		Empleado evilEmpleado = new Empleado("Evil Empleado", 666, "correo@gmail.com", "6283764", "ABC123", "23487923", "Dueño");
		
		evilEmpleado.mostrarInformacion();
		
		Persona personita = new Persona("Miguel", 24);
		
		personita.mostrarInformacion();
		
		System.out.println("Instancia de un cliente \n");
		
		Cliente Miguel = new Cliente("Miguel Michi", "ASD234", 2387.2f, "1234");
		
		Miguel.mostrarInfoCliente();
		
		//modificacion de un atributo 
		
		Miguel.nombre = "Mianchi";
		
		
		
		System.out.println();
		
		Miguel.mostrarInfoCliente();
		
		Miguel.setSaldo(0.0f);
		
		System.out.println();
		
		Miguel.mostrarInfoCliente();
		
		//Getter
		System.out.println();
		
	
		System.out.println(Miguel.getCuentaBancaria());
		
		
		
	
		
		
		
		
	}
	

}

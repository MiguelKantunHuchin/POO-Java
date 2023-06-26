package entidades;

public class Cliente {
	
	public String nombre;
	private String cuentaBancaria;
	private float saldo;
	private String nip;
	
	
	public Cliente(String nombre, String cuentaBancaria, float saldo, String nip) {
		this.nombre = nombre;
		this.cuentaBancaria = cuentaBancaria;
		this.saldo = saldo;
		this.nip = nip;
	}
	
	public void mostrarInfoCliente() {
		
		System.out.println("El nombre es: " + nombre);
		System.out.println("La cuenta bancaria es: " + cuentaBancaria);
		System.out.println("El saldo es: " + saldo);
		System.out.println("El nip es: " + nip);
		
	}

	public String getCuentaBancaria() {
		return cuentaBancaria;
	}

	public void setCuentaBancaria(String cuentaBancaria) {
		this.cuentaBancaria = cuentaBancaria;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public String getNip() {
		return nip;
	}

	public void setNip(String nip) {
		this.nip = nip;
	}

	
	
	

}


/*
 * Encapsulamiento (1 de los 4 pilares de la POO)
 * 
 * 
 * Tiene que ver con la forma en como ocultamos algunos detalles de nuestra clase (atributos y metodos). La gran ventaja de hacer esto es que podemos proteger los datos y el comportamiento de una clase. Cuando utilizamos los modificadores de acceso, podemos controlar la forma en como se accede a los datos y como interactuamos con ellos. 
 * 
 * 
 * Modificadores de acceso
 * 
 *     - public
 *     - private
 *     - protected
 *     - default (sin modificador de acceso)
 * 
 *
 *Con esto buscamos evitar:
 *
 *    - Reasignacion de valores
 *
 *        float cuenta = 157,478.75f;
 *        cuenta = 0.00f; 
 *        
 *        
 *        
 *       Cuando declaramos nuestros atributos como privados se impide el acceso a esta informacion (No podremos imprimirla en consola, mucho menos modificarla).
 *       
 *       
 *       Miguel.nombre; Si puedo ya que la informacion es publica
 *       
 *       Miguel.saldo; No se muestra porque la informacion es privada
 *       
 *       
 *       Para solventar esto, tenemos los metodos Getter y Setter
 *       
 *       Con Getter podemos acceder a la informacion
 *       Con Getter podemos modificar la informacion
 *
 * 
 */
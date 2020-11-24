/*@Author: Daniel Arizu
 * 
 * Date: 24/11/20
 *  
 *  Comments: Esta clase contiene:
 *  - Una interfaz que retorna un valor de tipo FLOAT
 *  - Un metodo Ejecutar en el que se implement la función lambda
 *  - Un método en el que se explica lo que hace la aplicación.
 *  
 *  
 *  */

package com.M9F2.Application;


//Interfaz funcional que retorna un valor double

@FunctionalInterface
interface InterfazPi {
	
	
	double getPiValue();
}



public class Application {

	//Método principal de la aplicación
	public void Ejecutar() {
		information();
		InterfazPi inter;
		inter = () -> 3.1415;
		System.out.println("El valor de Pi es el siguiente: " + inter.getPiValue());
		
	}

	//Método que explica lo que hace la aplicación
	private void information() {
		System.out.println("\n\nEsta aplicación retorna un valor double, mediante una interfaz con un metodo abstracto, en es te caso le pasamo el valor de PI.");	
		
	}
}

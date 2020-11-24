/*@Author: Daniel Arizu
 * 
 * Date: 24/11/20
 *  
 *  Comments: Esta clase contiene:
 *  - Una interfaz que retorna un valor de tipo FLOAT
 *  - Un metodo Ejecutar en el que se implement la funci�n lambda
 *  - Un m�todo en el que se explica lo que hace la aplicaci�n.
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

	//M�todo principal de la aplicaci�n
	public void Ejecutar() {
		information();
		InterfazPi inter;
		inter = () -> 3.1415;
		System.out.println("El valor de Pi es el siguiente: " + inter.getPiValue());
		
	}

	//M�todo que explica lo que hace la aplicaci�n
	private void information() {
		System.out.println("\n\nEsta aplicaci�n retorna un valor double, mediante una interfaz con un metodo abstracto, en es te caso le pasamo el valor de PI.");	
		
	}
}

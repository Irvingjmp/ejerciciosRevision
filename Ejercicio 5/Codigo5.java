package com.generation;
import java.util.Scanner; //Importar scanner

public class Codigo5 {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);  //Añadir system in
	    System.out.println("Introduzca un número: ");//Añadir comillas
	    String ni = s.nextLine(); //Se lee número como string
	    
	    //Convertimos string a Int
	    int sn = Integer.parseInt(ni);
	    int afo = 0; //Digitos afortunados
	    int noAfo = 0; //digitos desafortunados
	    
	    
	    while (sn > 0) {
		  int digito = sn % 10;
	      if ((digito == 3) || (digito == 7) || (digito == 8) || (digito == 9)) {
			afo++;
	      } else {
			noAfo++;
	      }
		  sn /= 10;
	    }
	      
	    if (afo > noAfo) {
	      System.out.println("El " + ni + " es un número afortunado.");
	    } else {
	      System.out.println("El " + ni + " no es un número afortunado.");
	    }
		    
		  
	    s.close();
	}

}

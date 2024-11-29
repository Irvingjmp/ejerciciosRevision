package com.generation;
import java.util.Scanner;

public class Codigo6 {

	public static void main(String[] args) {
		//arreglo de int con 20 elementos
		int[] n = new int[20]; //Corrección de decalración

	    for (int i = 0; i < 20; i++) {//faltaba un +
	      n[i] = (int)(Math.random() * 381) + 20;
	      System.out.print(n[i] + " "); //System out
	    }
	    
	    System.out.println("\n¿Que números quiere resaltar? ");//println 
	    System.out.println("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
	    
	    //Cambiamos el consol por scanner
	    
	    Scanner s = new Scanner(System.in);
	    int opcion = s.nextInt();

	    int multiplo = (opcion == 1) ? 5 : 7; //Corrección de ternario

	    for (int e : n) { //mal uso de foreach. Es int
	      if (e % multiplo == 0) {
	        System.out.print("[" + e + "] ");
	      } else {//no se cerró la llave
	        System.out.print(e + " "); //system.out
	      }
	    }
	    
	    s.close();

	}

}

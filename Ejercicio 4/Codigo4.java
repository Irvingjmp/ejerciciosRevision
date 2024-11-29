package com.generation;
import java.util.Scanner;

public class Codigo4 {
	public static void main(String[] args) {//Faltaba el public estatic void main

		Scanner s = new Scanner(System.in); //Falta el System.in e importar scanner
	
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    String j1 = s.nextLine();
	    
	    System.out.println("Turno del jugador 1 (introduzca piedra, papel o tijeras): ");
	    /*Scanner s2 = new Scanner(); No se inicializa otra vez*/
	    String j2 = s.nextLine();
	    
	    if (j1.equals(j2)) { //usar equals para string
	      System.out.println("Empate");
	    } else {
	      int g = 2;
	      switch(j1) {
	        case "piedra":
	          if (j2.equals("tijeras")) {
	            g = 1;
	          }
	
	        case "papel":
	          if (j2.equals("piedra")) {
	            g = 1;
	          }//faltaba corchete y break
	          break;
	          
	        case "tijeras":
	          if (j2.equals("papel")) {
	            g = 1;
	          }
	          break;
	          
	        default:
	        	System.out.println("Opcion invalida"); //Agregando opcion default
	        } 
	      System.out.println("Gana el jugador " + g);
	    }
	    s.close();
	}
}

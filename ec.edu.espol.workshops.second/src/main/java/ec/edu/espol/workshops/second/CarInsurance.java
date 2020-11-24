package ec.edu.espol.workshops.second;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarInsurance {
	
	public  static void carInsurance(String sexo,String casado,int edad) {
		int prima = 500;
	    if(sexo.equals("M") && casado.equals("not married") && edad<25) {
	    	prima+=1500;
	    }if(sexo.equals("F") && casado.equals("married")) {
	    	prima-=200;
	    }if(edad<65 && edad>45) {
	    	prima-=100;
	    }if(edad>80) {
	    	 System.out.println("No se vender seguros para mayores de 80");
	    	 prima=-1;
	    }
	    System.out.println("El valor de la prima es "+prima);
	}

	public static void main(String[] args) throws IOException {
		System.out.print("Ingrese su edad:");
	    String entradaTeclado = "";
	    Scanner entradaEscaner = new Scanner(new InputStreamReader(System.in, "UTF-8"));
	    entradaTeclado = entradaEscaner.nextLine();
	    int edad = Integer.parseInt(entradaTeclado);
	    while(edad<0) {
	    	entradaTeclado = "";
	    	System.out.print("Error, ingrese un numero positivo.");
	    	System.out.print("Ingrese su edad:");
		    entradaTeclado = entradaEscaner.nextLine();
		    edad = Integer.parseInt(entradaTeclado);
	    }
	    System.out.print("Ingrese su sexo(M/F):");
	    String sexo = entradaEscaner.nextLine();
	    while(!(sexo.equals("M") || sexo.equals("F"))) {
	    	System.out.print("Error, ingrese M o F");
	    	entradaTeclado = "";
	    	System.out.print("Ingrese su sexo(M/F):");
		    sexo = entradaEscaner.nextLine();
	    }
	    entradaTeclado = "";
	    System.out.print("Ingrese si esta casado o no(married/not married):");
	    String casado = entradaEscaner.nextLine();
	    while(!(casado.equals("not married") || casado.equals("married"))) {
	    	System.out.print("Error, ingrese 'married' o 'not married' ");
	    	entradaTeclado = "";
	    	System.out.print("Ingrese si esta casado o no(married/not married):");
		    casado = entradaEscaner.nextLine();
	    }
	    entradaTeclado = "";
	    System.out.println(casado.equals("not married"));
	    int prima = 500;
	    if(sexo.equals("M") && casado.equals("not married") && edad<25) {
	    	prima+=1500;
	    	
	    }if(sexo.equals("F") && casado.equals("married")) {
	    	prima-=200;
	    }if(edad<65 && edad>45) {
	    	prima-=100;
	    }if(edad>80) {
	    	 System.out.println("No se vender seguros para mayores de 80");
	    	 prima=-1;
	    }
	    System.out.println("El valor de la prima es "+prima);
	}
	
}

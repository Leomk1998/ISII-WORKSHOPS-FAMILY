package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class CarInsurance {
	public static void main(String[] args) {
		System.out.print("Ingrese su edad:");
	    String entradaTeclado = "";
	    Scanner entradaEscaner = new Scanner(System.in);
	    entradaTeclado = entradaEscaner.nextLine();
	    int edad = Integer.parseInt(entradaTeclado);
	    System.out.print("Ingrese su sexo(M/F):");
	    String sexo = entradaEscaner.nextLine();
	    entradaTeclado = "";
	    System.out.print("Ingrese si esta casado o no(married/not married):");
	    String casado = entradaEscaner.nextLine();
	    entradaTeclado = "";
	    System.out.println(casado.equals("not married"));
	    int prima = 600;
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

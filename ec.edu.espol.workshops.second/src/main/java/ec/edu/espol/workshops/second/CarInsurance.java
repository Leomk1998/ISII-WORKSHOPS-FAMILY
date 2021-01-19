package ec.edu.espol.workshops.second;

import java.util.Scanner;

public class CarInsurance {
	public static int carInsurance(String sexo,String casado,int edad) {
		int prima = 500;
		if((edad<45 && edad>25) && sexo.equals("M") ) {
	    	prima-=100;
	    }
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
	    return prima;		
	}
	
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
	    int prima=0;
	    prima = carInsurance(sexo,casado,edad);
	    System.out.println("El valor de la prima es "+prima);
	}
	
	
}

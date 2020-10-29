package ec.edu.espol.workshops.second;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class CarInsurance {

	public static void main(String[] args) throws IOException {
		System.out.print("Ingrese su edad:");
	    String entradaTeclado = "";
	    Scanner entradaEscaner = new Scanner(new InputStreamReader(System.in, "UTF-8"));
	    entradaTeclado = entradaEscaner.nextLine();
	    int edad = Integer.parseInt(entradaTeclado);
	    System.out.print("Ingrese su sexo(M/F):");
	    entradaTeclado = "";
	    String casado = entradaEscaner.nextLine();
	    System.out.print("Ingrese si esta casado o no(married/not married):");
	    entradaTeclado = "";
	    String sexo = entradaEscaner.nextLine();
	    int prima = 500;
	    if(sexo =="M" && casado == "not married" && edad<25) {
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

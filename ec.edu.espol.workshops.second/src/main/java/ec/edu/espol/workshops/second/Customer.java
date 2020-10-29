package ec.edu.espol.workshops.second;
/*Clase Customer 29/10/2020*/
public class Customer {
	String sexo;
	String casado;
	int edad;
	
	public Customer() {
		
	}
	
	
	public String getSexo() {
		return sexo;
	}



	public void setSexo(String sexo) {
		this.sexo = sexo;
	}



	public String getCasado() {
		return casado;
	}



	public void setCasado(String casado) {
		this.casado = casado;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}



	@Override
	public String toString() {
		return "Customer [sexo=" + sexo + ", casado=" + casado + ", edad=" + edad + "]";
	}
	
	
}

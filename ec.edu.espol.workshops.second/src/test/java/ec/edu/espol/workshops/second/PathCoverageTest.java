package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PathCoverageTest {
	
	 @Test
	 public void testNotOld() {
	      int prima = 2100;
	      String sexo = "M";
	      int edad = 19;
	      CarInsurance carinsurence = new CarInsurance();
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testManNotMarried() {
	     int prima = 2100;;
	      String sexo = "M";
	      int edad = 24;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testTooOld() {
		  int prima = -1;
	      String sexo = "M";
	      int edad = 90;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testTooOldWoman() {
		  int prima = -1;
	      String sexo = "F";
	      int edad = 90;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testWomanMarried() {
		  int prima = 400;
	      String sexo = "F";
	      int edad = 24;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testMature() {
		  int prima = 300;
	      String sexo = "F";
	      int edad = 50;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testNormalPrima() {
		  int prima = 600;
	      String sexo = "M";
	      int edad = 40;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
	 
}

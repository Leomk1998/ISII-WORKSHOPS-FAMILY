package ec.edu.espol.workshops.second;

import org.junit.Test;
import static org.junit.Assert.assertEquals;


public class PathCoverageTest {
	
	@Test
	 public void TestMeatureMen() {
	      int prima = 400;
	      String sexo = "M";
	      int edad = 30;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }

	 @Test
	 public void testNotOld() {
	      int prima = 2000;
	      String sexo = "M";
	      int edad = 19;
	      String casado = "not married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testManNotMarried() {
	     int prima = 2000;;
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
		  int prima = 300;
	      String sexo = "F";
	      int edad = 24;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testMature() {
		  int prima = 200;
	      String sexo = "F";
	      int edad = 50;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 @Test
	 public void testNormalPrima() {
		  int prima = 500;
	      String sexo = "M";
	      int edad = 20;
	      String casado = "married";
	      assertEquals(CarInsurance.carInsurance(sexo, casado, edad),prima);
	 }
	 
}

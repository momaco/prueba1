package com.StringCalculator.model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {
	
	StringCalculatorModel calculadora=new StringCalculatorModel();
	int iqCaracteres;
	String cadena="1,2,3";
	int resultadoEsperado=3;


	@Test
	public void testIAdd() {
	
		iqCaracteres=calculadora.iAdd(cadena);
		assertEquals(resultadoEsperado, iqCaracteres);
	}

	@Test
	public void testFAdd() {
		
	}

}

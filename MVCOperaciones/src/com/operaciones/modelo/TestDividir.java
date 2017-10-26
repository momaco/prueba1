package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operaciones.operacionesMatematicas;

public class TestDividir {

	@Test
	public void test() {
		operacionesMatematicas test=new operacionesMatematicas();
		test.setNumero1(9.0f);
		test.setNumero2(3.0f);
		float result=test.dividir();
		assertTrue(3.0==result);
	}

}

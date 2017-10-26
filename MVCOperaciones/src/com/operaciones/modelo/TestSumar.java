package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operaciones.operacionesMatematicas;

public class TestSumar {

	@Test
	public void test() {
		operacionesMatematicas test=new operacionesMatematicas();
		test.setNumero1(1.0f);
		test.setNumero2(2.0f);
		float result=test.sumar();
		assertTrue(3.0==result);
	}

}

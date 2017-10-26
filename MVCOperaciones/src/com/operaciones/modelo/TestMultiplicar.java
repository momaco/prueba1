package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operaciones.operacionesMatematicas;

public class TestMultiplicar {

	@Test
	public void test() {
		operacionesMatematicas test=new operacionesMatematicas();
		test.setNumero1(3.0f);
		test.setNumero2(2.0f);
		float result=test.multiplicar();
		assertTrue(6.0==result);
	}

}

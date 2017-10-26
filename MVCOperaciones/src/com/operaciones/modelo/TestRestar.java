package com.operaciones.modelo;

import static org.junit.Assert.*;

import org.junit.Test;

import com.operaciones.operacionesMatematicas;

public class TestRestar {

	@Test
	public void test() {
		operacionesMatematicas test=new operacionesMatematicas();
		test.setNumero1(4.0f);
		test.setNumero2(2.0f);
		float result=test.restar();
		assertTrue(2.0==result);
	}

}

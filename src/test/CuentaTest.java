package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Cuenta;

class CuentaTest {
	
	static Cuenta ctaPruebas;
	static Cuenta 12345;
	static Cuenta 67890;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		ctaPruebas = new Cuenta(0);
		12345 = new Cuenta(50);
		67890 = new Cuenta(0);
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		ctaPruebas.setSaldo(0);
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testIngresar() {
		ctaPruebas.Ingresar(3000);
		assertEquals(3000,ctaPruebas.getSaldo());
		
	}
	
	@Test
	void testRetirar() {
		ctaPruebas.Retirar(500);
		assertEquals(-500,ctaPruebas.getSaldo());
		
	}
	
	void testMovimiento() {
		assertEquals(50,12345.getSaldo());
		assertEquals(0,67890.getSaldo());
	}
	
	void test0014() {
		
		
	}

}

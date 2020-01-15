package cl.aligare.tdd.adoption_plan;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class IVATest {
	
	IVA iva;
	
	@Before
	public void classGeneration() {
		iva= new IVA();
	}
	
	@Test
	public void obtenerImpuestoDesdeMontoNeto() {
		assertEquals(9899, iva.getTax(52101));
		assertEquals(4790, iva.getTax(25210));
		assertEquals(3034, iva.getTax(15966));
		assertEquals(2714, iva.getTax(14286));
		assertEquals(2395, iva.getTax(12605));
	}
	
	@Test
	public void obtenerMontoConIVA() {
		assertEquals(62000, iva.getAmountWithTax(52101));
		assertEquals(30000, iva.getAmountWithTax(25210));
		assertEquals(19000, iva.getAmountWithTax(15966));
		assertEquals(17000, iva.getAmountWithTax(14286));
		assertEquals(15000, iva.getAmountWithTax(12605));
	}
	
	@Test
	public void obtenerNeto() {
		assertEquals(52101, iva.getAmountWithoutTax(62000));
		assertEquals(25210, iva.getAmountWithoutTax(30000));
		assertEquals(15966, iva.getAmountWithoutTax(19000));
		assertEquals(14286, iva.getAmountWithoutTax(17000));
		assertEquals(12605, iva.getAmountWithoutTax(15000));
	}
}

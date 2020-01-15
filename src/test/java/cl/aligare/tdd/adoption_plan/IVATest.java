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
}

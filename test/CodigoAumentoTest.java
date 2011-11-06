import static org.junit.Assert.*;

import org.junit.Test;


public class CodigoAumentoTest {

	@Test
	public void deveApresentarAumentoDeValoresCom10porCentos() {
		double resultado = CalculaAumento.calcularAumento(500, 1);
		assertEquals(550, resultado,0);
	}
	
	@Test
	public void deveApresentarAumentoDeValoresCom25porCento() {
		double resultado = CalculaAumento.calcularAumento(500, 2);
		assertEquals(625, resultado,0);
	}
	
	@Test
	public void deveApresentarAumentoDeValoresCom30porCento() {
		double resultado = CalculaAumento.calcularAumento(500, 3);
		assertEquals(650, resultado,0);
	}
	
	@Test
	public void deveApresentarAumentoDeValoresCom50porCento() {
		double resultado = CalculaAumento.calcularAumento(500, 4);
		assertEquals(750, resultado,0);
	}

}

package co.com.xoftix.spaservicios.servicios.ge;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ge.Poblado;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IPobladoServicioTest extends BaseTest {

	@Autowired
	private IPobladoServicio iPobladoServicio;

	@Test
	public void consultar() {
		try {

			List<Poblado> provincias = iPobladoServicio
					.consultar(new Poblado());
			Assert.assertNotNull(provincias);
			Assert.assertTrue(provincias.size() >= 0);
		} catch (Exception e) {
			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

package co.com.xoftix.spaservicios.servicios.ge;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ge.Barriada;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IBarriadaServicioTest extends BaseTest {

	@Autowired
	private IBarriadaServicio iBarriadaServicio;

	@Test
	public void consultar() {
		try {

			List<Barriada> barriadas = iBarriadaServicio.consultar(
					new Barriada(), 10, 3);
			Assert.assertNotNull(barriadas);
			Assert.assertTrue(barriadas.size() >= 0);

		} catch (Exception e) {
			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

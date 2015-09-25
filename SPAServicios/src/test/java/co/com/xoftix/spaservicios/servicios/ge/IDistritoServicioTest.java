package co.com.xoftix.spaservicios.servicios.ge;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ge.Distrito;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IDistritoServicioTest extends BaseTest {

	@Autowired
	private IDistritoServicio iDistritoServicio;

	@Test
	public void consultar() {
		try {

			List<Distrito> distritos = iDistritoServicio
					.consultar(new Distrito());

			Assert.assertNotNull(distritos);
			Assert.assertTrue(distritos.size() >= 0);

		} catch (Exception e) {
			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

package co.com.xoftix.spaservicios.servicios.ge;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ge.Provincia;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IProvinciaServicioTest extends BaseTest {

	@Autowired
	private IProvinciaServicio iProvinciaServicio;

	@Test
	public void consultar() {
		try {

			
			List<Provincia> provincias = iProvinciaServicio
					.consultar(new Provincia());
			Assert.assertNotNull(provincias);
			Assert.assertTrue(provincias.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

	@Test
	public void consultarPaginado() {
		try {

			List<Provincia> provincias = iProvinciaServicio.consultar(
					new Provincia(), 6, 5);
			Assert.assertNotNull(provincias);
			Assert.assertTrue(provincias.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

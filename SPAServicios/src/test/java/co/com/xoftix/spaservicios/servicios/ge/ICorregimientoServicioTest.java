package co.com.xoftix.spaservicios.servicios.ge;

import co.com.xoftix.spaservicios.entidades.ge.Corregimiento;
import co.com.xoftix.spaservicios.servicios.BaseTest;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

public class ICorregimientoServicioTest extends BaseTest {

	@Autowired
	private ICorregimientoServicio iCorregimientoServicio;

	@Test
	public void consultar() {
		try {

			List<Corregimiento> corregimientos = iCorregimientoServicio
					.consultar(new Corregimiento());
			Assert.assertNotNull(corregimientos);
			Assert.assertTrue(corregimientos.size() >= 0);

		} catch (Exception e) {
			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

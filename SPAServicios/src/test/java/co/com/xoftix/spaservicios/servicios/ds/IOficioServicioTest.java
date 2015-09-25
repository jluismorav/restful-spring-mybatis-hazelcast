package co.com.xoftix.spaservicios.servicios.ds;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ds.Oficio;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IOficioServicioTest extends BaseTest {

	@Autowired
	private IOficioServicio iOficioServicio;

	@Test
	public void consultar() {
		try {

			List<Oficio> Oficios = iOficioServicio.consultar(new Oficio());
			if (!Oficios.isEmpty()) {
				Oficio Oficio = Oficios.get(0);
				Oficio.setId(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setActivo(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setCodigo(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setNombre(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setControl(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setIdDescriptor(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

				Oficio.setIcono(null);
				Oficios = iOficioServicio.consultar(Oficio);
				Assert.assertNotNull(Oficios);
				Assert.assertTrue(Oficios.size() >= 1);

			}

			Assert.assertNotNull(Oficios);
			Assert.assertTrue(Oficios.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

package co.com.xoftix.spaservicios.servicios.ds;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ds.TipoIdentificacion;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class TipoIdentificacionServicioTest extends BaseTest {

	@Autowired
	private ITipoIdentificacionServicio iTipoIdentificacionServicio;

	@Test
	public void consultar() {
		try {

			List<TipoIdentificacion> TipoIdentificacions = iTipoIdentificacionServicio.consultar(new TipoIdentificacion());
			if (!TipoIdentificacions.isEmpty()) {
				TipoIdentificacion TipoIdentificacion = TipoIdentificacions.get(0);
				TipoIdentificacion.setId(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setActivo(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setCodigo(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setNombre(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setControl(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setIdDescriptor(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

				TipoIdentificacion.setIcono(null);
				TipoIdentificacions = iTipoIdentificacionServicio.consultar(TipoIdentificacion);
				Assert.assertNotNull(TipoIdentificacions);
				Assert.assertTrue(TipoIdentificacions.size() >= 1);

			}

			Assert.assertNotNull(TipoIdentificacions);
			Assert.assertTrue(TipoIdentificacions.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

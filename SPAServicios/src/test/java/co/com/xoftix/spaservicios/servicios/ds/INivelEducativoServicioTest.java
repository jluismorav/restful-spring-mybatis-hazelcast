package co.com.xoftix.spaservicios.servicios.ds;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ds.NivelEducativo;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class INivelEducativoServicioTest extends BaseTest {

	@Autowired
	private INivelEducativoServicio iNivelEducativoServicio;

	@Test
	public void consultar() {
		try {

			List<NivelEducativo> NivelEducativos = iNivelEducativoServicio
					.consultar(new NivelEducativo());
			if (!NivelEducativos.isEmpty()) {
				NivelEducativo NivelEducativo = NivelEducativos.get(0);
				NivelEducativo.setId(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setActivo(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setCodigo(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setNombre(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setControl(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setIdDescriptor(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

				NivelEducativo.setIcono(null);
				NivelEducativos = iNivelEducativoServicio
						.consultar(NivelEducativo);
				Assert.assertNotNull(NivelEducativos);
				Assert.assertTrue(NivelEducativos.size() >= 1);

			}

			Assert.assertNotNull(NivelEducativos);
			Assert.assertTrue(NivelEducativos.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

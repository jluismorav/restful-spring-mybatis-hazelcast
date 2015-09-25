package co.com.xoftix.spaservicios.servicios.ds;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import co.com.xoftix.spaservicios.entidades.ds.Genero;
import co.com.xoftix.spaservicios.servicios.BaseTest;

public class IGeneroServicioTest extends BaseTest {

	@Autowired
	private IGeneroServicio iGeneroServicio;

	@Test
	public void consultar() {
		try {

			List<Genero> generos = iGeneroServicio.consultar(new Genero());
			if (!generos.isEmpty()) {
				Genero genero = generos.get(0);
				genero.setId(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setActivo(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setCodigo(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setNombre(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setControl(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setIdDescriptor(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

				genero.setIcono(null);
				generos = iGeneroServicio.consultar(genero);
				Assert.assertNotNull(generos);
				Assert.assertTrue(generos.size() >= 1);

			}

			Assert.assertNotNull(generos);
			Assert.assertTrue(generos.size() >= 0);

		} catch (Exception e) {

			Assert.fail("Se ha presentado un error en la consulta "
					+ e.getMessage());
		}
	}

}

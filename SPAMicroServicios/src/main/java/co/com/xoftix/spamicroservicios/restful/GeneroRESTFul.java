package co.com.xoftix.spamicroservicios.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.xoftix.spamicroservicios.util.GeneradorRespuestas;
import co.com.xoftix.spaservicios.entidades.ds.Genero;
import co.com.xoftix.spaservicios.servicios.ds.IGeneroServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/genero")
@Component
public class GeneroRESTFul {

	@Autowired
	private IGeneroServicio iGeneroServicio;

	@GET
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar() {
		try {
			Genero genero = new Genero();
			List<Genero> generos = iGeneroServicio.consultar(genero);
			return GeneradorRespuestas.respuestaOK(generos);
		} catch (Exception e) {
			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

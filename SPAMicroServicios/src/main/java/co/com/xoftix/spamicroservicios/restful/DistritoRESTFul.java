package co.com.xoftix.spamicroservicios.restful;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.xoftix.spamicroservicios.util.GeneradorRespuestas;
import co.com.xoftix.spaservicios.entidades.ge.Distrito;
import co.com.xoftix.spaservicios.servicios.ge.IDistritoServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/distrito")
@Component
public class DistritoRESTFul {
	@Autowired
	private IDistritoServicio iDistritoServicio;

	@GET
	@Path("/consultar/{idProvincia}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(@PathParam("idProvincia") Long idProvincia) {
		try {
			Distrito distrito = new Distrito();
			distrito.setIdProvincia(idProvincia);
			List<Distrito> distritos = iDistritoServicio.consultar(distrito);
			return GeneradorRespuestas.respuestaOK(distritos);
		} catch (Exception e) {

			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

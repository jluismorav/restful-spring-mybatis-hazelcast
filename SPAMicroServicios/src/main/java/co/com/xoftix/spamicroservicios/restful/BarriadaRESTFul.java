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
import co.com.xoftix.spaservicios.entidades.ge.Barriada;
import co.com.xoftix.spaservicios.servicios.ge.IBarriadaServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/barriada")
@Component
public class BarriadaRESTFul {
	@Autowired
	private IBarriadaServicio iBarriadaServicio;

	@GET
	@Path("/consultar/{idPoblado}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(@PathParam("idPoblado") Long idPoblado) {
		try {
			Barriada barriada = new Barriada();
			barriada.setIdPoblado(idPoblado);
			List<Barriada> poblados = iBarriadaServicio.consultar(barriada);
			return GeneradorRespuestas.respuestaOK(poblados);
		} catch (Exception e) {

			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

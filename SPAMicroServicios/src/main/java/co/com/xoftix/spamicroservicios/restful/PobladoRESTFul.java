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
import co.com.xoftix.spaservicios.entidades.ge.Poblado;
import co.com.xoftix.spaservicios.servicios.ge.IPobladoServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/poblado")
@Component
public class PobladoRESTFul {
	@Autowired
	private IPobladoServicio iPobladoServicio;

	/**
	 * 
	 * @param idProvincia
	 * @return
	 */
	@GET
	@Path("/consultar/{idCorregimiento}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(@PathParam("idCorregimiento") Long idCorregimiento) {

		try {
			Poblado poblado = new Poblado();
			poblado.setIdCorregimiento(idCorregimiento);
			List<Poblado> poblados = iPobladoServicio.consultar(poblado);
			return GeneradorRespuestas.respuestaOK(poblados);
		} catch (Exception e) {

			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

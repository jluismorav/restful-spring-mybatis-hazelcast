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
import co.com.xoftix.spaservicios.entidades.ge.Corregimiento;
import co.com.xoftix.spaservicios.servicios.ge.ICorregimientoServicio;

/**
 *
 * @author jmoraxoftix
 *
 */
@Path("/corregimiento")
@Component
public class CorregimientoRESTFul {

	@Autowired
	private ICorregimientoServicio iCorregimientoServicio;

	@GET
	@Path("/consultar/{idDistrito}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar(@PathParam("idDistrito") Long idDistrito) {
		try {
			Corregimiento corregimiento = new Corregimiento();
			corregimiento.setIdDistrito(idDistrito);
			List<Corregimiento> corregimientos = iCorregimientoServicio
					.consultar(corregimiento);
			return GeneradorRespuestas.respuestaOK(corregimientos);
		} catch (Exception e) {

			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

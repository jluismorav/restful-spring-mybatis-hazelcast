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
import co.com.xoftix.spaservicios.entidades.ds.TipoIdentificacion;
import co.com.xoftix.spaservicios.servicios.ds.ITipoIdentificacionServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/tipoIdentificacion")
@Component
public class TipoIdentificacionRESTFul {

	@Autowired
	private ITipoIdentificacionServicio iTipoIdentificacionServicio;

	@GET
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar() {
		try {
			TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();
			List<TipoIdentificacion> tipoIdentificacions = iTipoIdentificacionServicio
					.consultar(tipoIdentificacion);
			return GeneradorRespuestas.respuestaOK(tipoIdentificacions);
		} catch (Exception e) {
			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

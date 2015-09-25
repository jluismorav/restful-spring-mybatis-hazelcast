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
import co.com.xoftix.spaservicios.entidades.ds.Oficio;
import co.com.xoftix.spaservicios.servicios.ds.IOficioServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/oficio")
@Component
public class OficioRESTFul {

	@Autowired
	private IOficioServicio iOficioServicio;

	@GET
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar() {
		try {
			Oficio oficio = new Oficio();
			List<Oficio> oficios = iOficioServicio.consultar(oficio);
			return GeneradorRespuestas.respuestaOK(oficios);
		} catch (Exception e) {
			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

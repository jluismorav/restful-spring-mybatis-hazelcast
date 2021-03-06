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
import co.com.xoftix.spaservicios.entidades.ds.NivelEducativo;
import co.com.xoftix.spaservicios.servicios.ds.INivelEducativoServicio;

/**
 * 
 * @author jmoraxoftix
 *
 */
@Path("/nivelEducativo")
@Component
public class NivelEducativoRESTFul {

	@Autowired
	private INivelEducativoServicio iNivelEducativoServicio;

	@GET
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar() {
		try {
			NivelEducativo nivelEducativo= new NivelEducativo();
			List<NivelEducativo> nivelEducativos = iNivelEducativoServicio.consultar(nivelEducativo);
			return GeneradorRespuestas.respuestaOK(nivelEducativos);
		} catch (Exception e) {
			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}

	}

}

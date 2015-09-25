package co.com.xoftix.spamicroservicios.util;

import javax.ws.rs.core.Response;

/**
 * Clase que tiene como responsabilidad generar las respuestas a las solicitudes
 * de los RESTFul
 * 
 * @author jmoraxoftix
 *
 */
public class GeneradorRespuestas {

	private static Response construirRespuesta(Object object,
			Response.Status status) {
		Respuesta respuesta = new Respuesta();
		respuesta.setStatus(status);
		respuesta.setInformacion(object);
		return Response.status(status).entity(respuesta).build();
	}

	public static Response respuestaOK(Object respuesta) {

		return construirRespuesta(respuesta, Response.Status.OK);
	}

	public static Response respuestaINTERNAL_SERVER_ERROR(Object respuesta) {
		return construirRespuesta(respuesta,
				Response.Status.INTERNAL_SERVER_ERROR);
	}

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import co.com.xoftix.spaservicios.entidades.ge.Provincia;
import co.com.xoftix.spaservicios.servicios.ge.IProvinciaServicio;

/**
 *
 * @author jmoraxoftix
 */
@Path("/provincia")
@Component
public class ProvinciaRESTFul {

	@Autowired
	private IProvinciaServicio iProvinciaServicio;

	@GET
	@Path("/consultar")
	@Produces(MediaType.APPLICATION_JSON)
	public Response consultar() {
		try {
			List<Provincia> listaProvincia = iProvinciaServicio
					.consultar(new Provincia());
			return GeneradorRespuestas.respuestaOK(listaProvincia);
		} catch (Exception e) {

			return GeneradorRespuestas.respuestaINTERNAL_SERVER_ERROR(e);
		}
	}

}

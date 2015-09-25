package co.com.xoftix.spamicroservicios.util;

import java.io.Serializable;

import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Respuesta implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4542806493272734621L;

	private Response.Status status;
	private Object informacion;

	public Response.Status getStatus() {

		return status;
	}

	public void setStatus(Response.Status status) {
		this.status = status;

	}

	public Object getInformacion() {
		return informacion;
	}

	public void setInformacion(Object informacion) {
		this.informacion = informacion;
	}

}

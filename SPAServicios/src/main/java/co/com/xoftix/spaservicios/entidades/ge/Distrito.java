package co.com.xoftix.spaservicios.entidades.ge;

import java.io.Serializable;

public class Distrito implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1359449328889678139L;

	private Long id;
	private Long idProvincia;
	private String nombre;
	private String codigo;
	private Boolean escabecera;
	private Boolean activo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Boolean getEscabecera() {
		return escabecera;
	}

	public void setEscabecera(Boolean escabecera) {
		this.escabecera = escabecera;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}

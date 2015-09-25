package co.com.xoftix.spaservicios.entidades.ge;

import java.io.Serializable;

public class Barriada implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -387544468297726837L;

	private Long id;
	private Long idPoblado;
	private String nombre;
	private Boolean activo;
	private Long codigo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Boolean getActivo() {
		return activo;
	}

	public void setActivo(Boolean activo) {
		this.activo = activo;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Long getIdPoblado() {
		return idPoblado;
	}

	public void setIdPoblado(Long idPoblado) {
		this.idPoblado = idPoblado;
	}

}

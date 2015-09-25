/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.xoftix.spaservicios.entidades.ge;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Provincia implements Serializable {

	/**
     *
     */
	private static final long serialVersionUID = -4052389438872676993L;
	private Long id;
	private Long idPais;
	private Long idDistritoJudicial;
	private String nombre;
	private Boolean activo;
	private Boolean esComarca;
	private String codigo;

	public Provincia() {

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getIdPais() {
		return idPais;
	}

	public void setIdPais(Long idPais) {
		this.idPais = idPais;
	}

	public Long getIdDistritoJudicial() {
		return idDistritoJudicial;
	}

	public void setIdDistritoJudicial(Long idDistritoJudicial) {
		this.idDistritoJudicial = idDistritoJudicial;
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

	public Boolean getEsComarca() {
		return esComarca;
	}

	public void setEsComarca(Boolean esComarca) {
		this.esComarca = esComarca;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [id=");
		builder.append(id);
		builder.append(", idPais=");
		builder.append(idPais);
		builder.append(", idDistritoJudicial=");
		builder.append(idDistritoJudicial);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", activo=");
		builder.append(activo);
		builder.append(", esComarca=");
		builder.append(esComarca);
		builder.append(", codigo=");
		builder.append(codigo);
		builder.append("]");
		return builder.toString();
	}

	

}

package co.com.xoftix.spaservicios.entidades.ge;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UnidadReceptora implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4938127937025747156L;
	private Long id;
	private String nombre;
	private Long idPoblado;
	private String codigo;
	private Long idEspecialidadServicio;
	private Long idTipoOficina;
	private Long idInstitucion;

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

	public Long getIdPoblado() {
		return idPoblado;
	}

	public void setIdPoblado(Long idPoblado) {
		this.idPoblado = idPoblado;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getIdEspecialidadServicio() {
		return idEspecialidadServicio;
	}

	public void setIdEspecialidadServicio(Long idEspecialidadServicio) {
		this.idEspecialidadServicio = idEspecialidadServicio;
	}

	public Long getIdTipoOficina() {
		return idTipoOficina;
	}

	public void setIdTipoOficina(Long idTipoOficina) {
		this.idTipoOficina = idTipoOficina;
	}

	public Long getIdInstitucion() {
		return idInstitucion;
	}

	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}

}

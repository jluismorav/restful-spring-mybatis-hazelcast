package co.com.xoftix.spaservicios.entidades.ax;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author jmoraxoftix
 *
 */
@XmlRootElement
public class Descriptor implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2381186097664158742L;
	private Long id;
	private Long idDescriptor;
	private String codigo;
	private String nombre;
	private Boolean activo;
	private String icono;
	private String control;
	public Long getIdDescriptor() {
		return idDescriptor;
	}
	public void setIdDescriptor(Long idDescriptor) {
		this.idDescriptor = idDescriptor;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
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
	public String getIcono() {
		return icono;
	}
	public void setIcono(String icono) {
		this.icono = icono;
	}
	public String getControl() {
		return control;
	}
	public void setControl(String control) {
		this.control = control;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}

	
	
}

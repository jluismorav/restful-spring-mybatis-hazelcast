package co.com.xoftix.spaservicios.entidades.nc;

import java.io.Serializable;
import java.util.Date;

public class NoticiaCriminal implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2410872440049639238L;
	private Long id;
	private String numero;
	private Long idUnidadreceptora;
	private Long idProvincia;
	private Long idDistrito;
	private Long idCorregimiento;
	private Long idPoblado;
	private Long idBarriada;
	private String lugarOcurrencia;
	private Date fechaInicial;
	private Date fechaFinal;
	private Date fechaConocimiento;
	private String relatoHechos;
	private String refExp;
	private String nombreRemitente;
	private String cargoRemitente;
	private Date fechaRemite;
	private Date fechaHoraRegistro;
	private Long estimacionCuantia;
	private String observacionCambioEstado;
	private Long idSedePrimerInterviniente;
	private Long idOficinaAtiendeCaso;
	private Long estimacionDano;
	private Long idMensaje;
	private String idR2Police;
	private Long idEstadoNoticia;
	private Long idTipoNoticia;
	private Long idModoOperacion;
	private Long idInstitucion;
	private Long idTipoPrimerInterviniente;
	private Long idEspecialidadServicio;
	private Long idRemitente;
	private Long idFinalizador;
	private Date fechaHoraFinal;
	private String referencia;
	private Boolean manual;
	private Boolean esNoticiaCriminal;
	private Long idOrigen;
	private Boolean tipoNoticiaFormal;
	private Date fechaInforme;

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setIdUnidadreceptora(Long idUnidadreceptora) {
		this.idUnidadreceptora = idUnidadreceptora;
	}

	public Long getIdUnidadreceptora() {
		return idUnidadreceptora;
	}

	public void setIdProvincia(Long idProvincia) {
		this.idProvincia = idProvincia;
	}

	public Long getIdProvincia() {
		return idProvincia;
	}

	public void setIdDistrito(Long idDistrito) {
		this.idDistrito = idDistrito;
	}

	public Long getIdDistrito() {
		return idDistrito;
	}

	public void setIdCorregimiento(Long idCorregimiento) {
		this.idCorregimiento = idCorregimiento;
	}

	public Long getIdCorregimiento() {
		return idCorregimiento;
	}

	public void setIdPoblado(Long idPoblado) {
		this.idPoblado = idPoblado;
	}

	public Long getIdPoblado() {
		return idPoblado;
	}

	public void setIdBarriada(Long idBarriada) {
		this.idBarriada = idBarriada;
	}

	public Long getIdBarriada() {
		return idBarriada;
	}

	public void setLugarOcurrencia(String lugarOcurrencia) {
		this.lugarOcurrencia = lugarOcurrencia;
	}

	public String getLugarOcurrencia() {
		return lugarOcurrencia;
	}

	public void setFechaInicial(Date fechaInicial) {
		this.fechaInicial = fechaInicial;
	}

	public Date getFechaInicial() {
		return fechaInicial;
	}

	public void setFechaFinal(Date fechaFinal) {
		this.fechaFinal = fechaFinal;
	}

	public Date getFechaFinal() {
		return fechaFinal;
	}

	public void setFechaConocimiento(Date fechaConocimiento) {
		this.fechaConocimiento = fechaConocimiento;
	}

	public Date getFechaConocimiento() {
		return fechaConocimiento;
	}

	public void setRelatoHechos(String relatoHechos) {
		this.relatoHechos = relatoHechos;
	}

	public String getRelatoHechos() {
		return relatoHechos;
	}

	public void setRefExp(String refExp) {
		this.refExp = refExp;
	}

	public String getRefExp() {
		return refExp;
	}

	public void setNombreRemitente(String nombreRemitente) {
		this.nombreRemitente = nombreRemitente;
	}

	public String getNombreRemitente() {
		return nombreRemitente;
	}

	public void setCargoRemitente(String cargoRemitente) {
		this.cargoRemitente = cargoRemitente;
	}

	public String getCargoRemitente() {
		return cargoRemitente;
	}

	public void setFechaRemite(Date fechaRemite) {
		this.fechaRemite = fechaRemite;
	}

	public Date getFechaRemite() {
		return fechaRemite;
	}

	public void setFechaHoraRegistro(Date fechaHoraRegistro) {
		this.fechaHoraRegistro = fechaHoraRegistro;
	}

	public Date getFechaHoraRegistro() {
		return fechaHoraRegistro;
	}

	public void setEstimacionCuantia(Long estimacionCuantia) {
		this.estimacionCuantia = estimacionCuantia;
	}

	public Long getEstimacionCuantia() {
		return estimacionCuantia;
	}

	public void setObservacionCambioEstado(String observacionCambioEstado) {
		this.observacionCambioEstado = observacionCambioEstado;
	}

	public String getObservacionCambioEstado() {
		return observacionCambioEstado;
	}

	public void setIdSedePrimerInterviniente(Long idSedePrimerInterviniente) {
		this.idSedePrimerInterviniente = idSedePrimerInterviniente;
	}

	public Long getIdSedePrimerInterviniente() {
		return idSedePrimerInterviniente;
	}

	public void setIdOficinaAtiendeCaso(Long idOficinaAtiendeCaso) {
		this.idOficinaAtiendeCaso = idOficinaAtiendeCaso;
	}

	public Long getIdOficinaAtiendeCaso() {
		return idOficinaAtiendeCaso;
	}

	public void setEstimacionDano(Long estimacionDano) {
		this.estimacionDano = estimacionDano;
	}

	public Long getEstimacionDano() {
		return estimacionDano;
	}

	public void setIdMensaje(Long idMensaje) {
		this.idMensaje = idMensaje;
	}

	public Long getIdMensaje() {
		return idMensaje;
	}

	public void setIdR2Police(String idR2Police) {
		this.idR2Police = idR2Police;
	}

	public String getIdR2Police() {
		return idR2Police;
	}

	public void setIdEstadoNoticia(Long idEstadoNoticia) {
		this.idEstadoNoticia = idEstadoNoticia;
	}

	public Long getIdEstadoNoticia() {
		return idEstadoNoticia;
	}

	public void setIdTipoNoticia(Long idTipoNoticia) {
		this.idTipoNoticia = idTipoNoticia;
	}

	public Long getIdTipoNoticia() {
		return idTipoNoticia;
	}

	public void setIdModoOperacion(Long idModoOperacion) {
		this.idModoOperacion = idModoOperacion;
	}

	public Long getIdModoOperacion() {
		return idModoOperacion;
	}

	public void setIdInstitucion(Long idInstitucion) {
		this.idInstitucion = idInstitucion;
	}

	public Long getIdInstitucion() {
		return idInstitucion;
	}

	public void setIdTipoPrimerInterviniente(Long idTipoPrimerInterviniente) {
		this.idTipoPrimerInterviniente = idTipoPrimerInterviniente;
	}

	public Long getIdTipoPrimerInterviniente() {
		return idTipoPrimerInterviniente;
	}

	public void setIdEspecialidadServicio(Long idEspecialidadServicio) {
		this.idEspecialidadServicio = idEspecialidadServicio;
	}

	public Long getIdEspecialidadServicio() {
		return idEspecialidadServicio;
	}

	public void setIdRemitente(Long idRemitente) {
		this.idRemitente = idRemitente;
	}

	public Long getIdRemitente() {
		return idRemitente;
	}

	public void setIdFinalizador(Long idFinalizador) {
		this.idFinalizador = idFinalizador;
	}

	public Long getIdFinalizador() {
		return idFinalizador;
	}

	public void setFechaHoraFinal(Date fechaHoraFinal) {
		this.fechaHoraFinal = fechaHoraFinal;
	}

	public Date getFechaHoraFinal() {
		return fechaHoraFinal;
	}

	public void setReferencia(String referencia) {
		this.referencia = referencia;
	}

	public String getReferencia() {
		return referencia;
	}

	public void setManual(Boolean manual) {
		this.manual = manual;
	}

	public Boolean getManual() {
		return manual;
	}

	public void setEsNoticiaCriminal(Boolean esNoticiaCriminal) {
		this.esNoticiaCriminal = esNoticiaCriminal;
	}

	public Boolean getEsNoticiaCriminal() {
		return esNoticiaCriminal;
	}

	public void setIdOrigen(Long idOrigen) {
		this.idOrigen = idOrigen;
	}

	public Long getIdOrigen() {
		return idOrigen;
	}

	public Boolean getTipoNoticiaFormal() {
		return tipoNoticiaFormal;
	}

	public void setTipoNoticiaFormal(Boolean tipoNoticiaFormal) {
		this.tipoNoticiaFormal = tipoNoticiaFormal;
	}

	public Date getFechaInforme() {
		return fechaInforme;
	}

	public void setFechaInforme(Date fechaInforme) {
		this.fechaInforme = fechaInforme;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
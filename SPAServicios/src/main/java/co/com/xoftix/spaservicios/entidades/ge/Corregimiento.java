package co.com.xoftix.spaservicios.entidades.ge;

import java.io.Serializable;

/**
 *
 * @author jmoraxoftix
 */
public class Corregimiento implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 8618903679653143353L;

    private Long id;
    private Long idDistrito;
    private String nombre;
    private Boolean activo;
    private String codigo;
    private Boolean esComarca;
    private Long idCircuitoJudicial;

    /**
     * @return the id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return the idDistrito
     */
    public Long getIdDistrito() {
        return idDistrito;
    }

    /**
     * @param idDistrito the idDistrito to set
     */
    public void setIdDistrito(Long idDistrito) {
        this.idDistrito = idDistrito;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the activo
     */
    public Boolean getActivo() {
        return activo;
    }

    /**
     * @param activo the activo to set
     */
    public void setActivo(Boolean activo) {
        this.activo = activo;
    }

    /**
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the esComarca
     */
    public Boolean getEsComarca() {
        return esComarca;
    }

    /**
     * @param esComarca the esComarca to set
     */
    public void setEsComarca(Boolean esComarca) {
        this.esComarca = esComarca;
    }

    /**
     * @return the idCircuitoJudicial
     */
    public Long getIdCircuitoJudicial() {
        return idCircuitoJudicial;
    }

    /**
     * @param idCircuitoJudicial the idCircuitoJudicial to set
     */
    public void setIdCircuitoJudicial(Long idCircuitoJudicial) {
        this.idCircuitoJudicial = idCircuitoJudicial;
    }

}

package co.com.xoftix.spaservicios.servicios;

import java.util.List;

/**
 *
 * @author jmoraxoftix
 *
 * @param <T>
 */
public interface IServicio<T> {

    /**
     *
     * @param entidad
     * @return
     * @throws Exception
     */
    public List<T> consultar(T entidad) throws Exception;

    /**
     *
     * @param entidad
     * @return
     * @throws Exception
     */
    public T guardar(T entidad) throws Exception;

    /**
     *
     * @param entidad
     * @throws Exception
     */
    public T actualizar(T entidad) throws Exception;

    /**
     *
     * @param entidad
     * @return
     * @throws Exception
     */
    public T eliminar(T entidad) throws Exception;

    /**
     *
     * @param entidad
     * @param desde
     * @param hasta
     * @return
     * @throws Exception
     */
    public List<T> consultar(T entidad, int desde, int hasta) throws Exception;
}

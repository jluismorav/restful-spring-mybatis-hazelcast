package co.com.xoftix.spaservicios.mapper;

import java.util.List;
import org.apache.ibatis.session.RowBounds;

/**
 *
 * @author jmoraxoftix
 *
 * @param <T>
 */
public interface IMapper<T> {

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
    public T insertar(T entidad) throws Exception;

    /**
     *
     * @param entidad
     * @throws Exception
     */
    public void actualizar(T entidad) throws Exception;

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
     * @param rowBounds
     * @return
     * @throws Exception
     */
    public List<T> consultar(T entidad, RowBounds rowBounds) throws Exception;
}

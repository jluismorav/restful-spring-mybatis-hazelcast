package co.com.xoftix.spaservicios.servicios;

import java.util.List;

/**
 *
 * @author jmoraxoftix
 *
 * @param <T>
 */
public abstract class AbstractServicio<T> implements IServicio<T> {

    @Override
    public T actualizar(T entidad) throws Exception {

        throw new UnsupportedOperationException("Metodo no implementado ");
    }

    @Override
    public List<T> consultar(T entidad) throws Exception {
        throw new UnsupportedOperationException("Metodo no implementado ");
    }

    @Override
    public T eliminar(T entidad) throws Exception {
        throw new UnsupportedOperationException("Metodo no implementado ");
    }

    @Override
    public T guardar(T entidad) throws Exception {
        throw new UnsupportedOperationException("Metodo no implementado ");
    }

    @Override
    public List<T> consultar(T entidad, int desde, int hasta) throws Exception {
        throw new UnsupportedOperationException("Metodo no implementado"); //To change body of generated methods, choose Tools | Templates.
    }

}

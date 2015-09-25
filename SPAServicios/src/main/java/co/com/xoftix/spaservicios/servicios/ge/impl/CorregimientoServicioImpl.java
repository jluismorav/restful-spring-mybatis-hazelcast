package co.com.xoftix.spaservicios.servicios.ge.impl;

import co.com.xoftix.spaservicios.entidades.ge.Corregimiento;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.mapper.ge.CorregimientoMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.ICorregimientoServicio;
import org.apache.ibatis.session.RowBounds;

@Service
@Transactional
public class CorregimientoServicioImpl extends AbstractServicio<Corregimiento> implements
        ICorregimientoServicio {

    @Autowired
    private CorregimientoMapper corregimientoMapper;

    @Override
    public List<Corregimiento> consultar(Corregimiento entidad) throws Exception {
        return corregimientoMapper.consultar(entidad);
    }

    @Override
    public List<Corregimiento> consultar(Corregimiento entidad, int desde, int hasta) throws Exception {
        return corregimientoMapper.consultar(entidad, new RowBounds(desde, hasta));
    }

}

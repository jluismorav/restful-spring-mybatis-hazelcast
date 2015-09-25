package co.com.xoftix.spaservicios.servicios.ds.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ds.TipoIdentificacion;
import co.com.xoftix.spaservicios.mapper.ds.TipoIdentificacionMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ds.ITipoIdentificacionServicio;

@Service
@Transactional
public class TipoIdentificacionServicioImpl extends
		AbstractServicio<TipoIdentificacion> implements
		ITipoIdentificacionServicio {

	@Autowired
	private TipoIdentificacionMapper tipoIdentificacionMapper;

	@Override
	public List<TipoIdentificacion> consultar(TipoIdentificacion entidad)
			throws Exception {
		return tipoIdentificacionMapper.consultar(entidad);
	}

}

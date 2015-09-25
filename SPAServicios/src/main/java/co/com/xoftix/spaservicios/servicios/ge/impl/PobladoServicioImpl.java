package co.com.xoftix.spaservicios.servicios.ge.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ge.Poblado;
import co.com.xoftix.spaservicios.mapper.ge.PobladoMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.IPobladoServicio;

@Service
@Transactional
public class PobladoServicioImpl extends AbstractServicio<Poblado> implements
		IPobladoServicio {

	@Autowired
	private PobladoMapper pobladoMapper;

	@Override
	public List<Poblado> consultar(Poblado entidad) throws Exception {
		return pobladoMapper.consultar(entidad);
	}

	@Override
	public List<Poblado> consultar(Poblado entidad, int desde, int hasta)
			throws Exception {
		return pobladoMapper.consultar(entidad, new RowBounds(desde, hasta));
	}

}

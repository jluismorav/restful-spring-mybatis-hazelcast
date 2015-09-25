package co.com.xoftix.spaservicios.servicios.ge.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ge.Barriada;
import co.com.xoftix.spaservicios.mapper.ge.BarriadaMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.IBarriadaServicio;

@Service
@Transactional
public class BarriadaServicioImpl extends AbstractServicio<Barriada> implements
		IBarriadaServicio {

	@Autowired
	private BarriadaMapper barriadaMapper;

	@Override
	public List<Barriada> consultar(Barriada entidad) throws Exception {
		return barriadaMapper.consultar(entidad);
	}

	@Override
	public List<Barriada> consultar(Barriada entidad, int desde, int hasta)
			throws Exception {
		return barriadaMapper.consultar(entidad, new RowBounds(desde, hasta));
	}

}

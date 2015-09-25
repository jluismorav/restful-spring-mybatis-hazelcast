package co.com.xoftix.spaservicios.servicios.ds.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ds.Genero;
import co.com.xoftix.spaservicios.mapper.ds.GeneroMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ds.IGeneroServicio;

@Service
@Transactional
public class GeneroServicioImpl extends AbstractServicio<Genero> implements
		IGeneroServicio {

	@Autowired
	private GeneroMapper generoMapper;

	@Override
	public List<Genero> consultar(Genero entidad) throws Exception {
		return generoMapper.consultar(entidad);
	}

	@Override
	public List<Genero> consultar(Genero entidad, int desde, int hasta)
			throws Exception {
		return generoMapper.consultar(entidad, new RowBounds(desde, hasta));
	}

}

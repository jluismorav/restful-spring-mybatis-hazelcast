package co.com.xoftix.spaservicios.servicios.ds.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ds.Oficio;
import co.com.xoftix.spaservicios.mapper.ds.OficioMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ds.IOficioServicio;

@Service
@Transactional
public class OficioServicioImpl extends AbstractServicio<Oficio> implements
		IOficioServicio {

	@Autowired
	private OficioMapper oficioMapper;

	@Override
	public List<Oficio> consultar(Oficio entidad) throws Exception {

		return oficioMapper.consultar(entidad);
	}

}

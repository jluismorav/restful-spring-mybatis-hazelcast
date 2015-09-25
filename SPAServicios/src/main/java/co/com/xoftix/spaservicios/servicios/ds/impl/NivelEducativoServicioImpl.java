package co.com.xoftix.spaservicios.servicios.ds.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ds.NivelEducativo;
import co.com.xoftix.spaservicios.mapper.ds.NivelEducativoMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ds.INivelEducativoServicio;

@Service
@Transactional
public class NivelEducativoServicioImpl extends
		AbstractServicio<NivelEducativo> implements INivelEducativoServicio {

	@Autowired
	private NivelEducativoMapper nivelEducativoMapper;

	@Override
	public List<NivelEducativo> consultar(NivelEducativo entidad)
			throws Exception {

		return nivelEducativoMapper.consultar(entidad);
	}

}

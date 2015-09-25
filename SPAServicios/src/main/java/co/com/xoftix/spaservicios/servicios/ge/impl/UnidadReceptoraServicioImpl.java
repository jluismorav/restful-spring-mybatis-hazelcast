package co.com.xoftix.spaservicios.servicios.ge.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ge.UnidadReceptora;
import co.com.xoftix.spaservicios.mapper.ge.UnidadReceptoraMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.IUnidadReceptoraServicio;

@Service
@Transactional
public class UnidadReceptoraServicioImpl extends
		AbstractServicio<UnidadReceptora> implements IUnidadReceptoraServicio {
	@Autowired
	private UnidadReceptoraMapper unidadReceptoraMapper;

	@Override
	public List<UnidadReceptora> consultar(UnidadReceptora entidad)
			throws Exception {
		return unidadReceptoraMapper.consultar(entidad);
	}
}

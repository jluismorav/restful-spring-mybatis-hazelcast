/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.xoftix.spaservicios.servicios.ge.impl;

import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ge.Provincia;
import co.com.xoftix.spaservicios.mapper.ge.ProvinciaMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.IProvinciaServicio;

@Service
@Transactional
public class ProvinciaServicioImpl extends AbstractServicio<Provincia>
		implements IProvinciaServicio {

	@Autowired
	private ProvinciaMapper provinciaMapper;

	@Override
	public List<Provincia> consultar(Provincia entidad) throws Exception {
		return provinciaMapper.consultar(entidad);
	}

	@Override
	public List<Provincia> consultar(Provincia entidad, int desde, int hasta)
			throws Exception {
		return provinciaMapper.consultar(entidad, new RowBounds(desde, hasta));
	}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.xoftix.spaservicios.servicios.ge.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import co.com.xoftix.spaservicios.entidades.ge.Distrito;
import co.com.xoftix.spaservicios.mapper.ge.DistritoMapper;
import co.com.xoftix.spaservicios.servicios.AbstractServicio;
import co.com.xoftix.spaservicios.servicios.ge.IDistritoServicio;
import org.apache.ibatis.session.RowBounds;

@Service
@Transactional
public class DistritoServicioImpl extends AbstractServicio<Distrito> implements
        IDistritoServicio {

    @Autowired
    private DistritoMapper distritoMapper;

    @Override
    public List<Distrito> consultar(Distrito entidad) throws Exception {

        return distritoMapper.consultar(entidad);
    }

    @Override
    public List<Distrito> consultar(Distrito entidad, int desde, int hasta) throws Exception {
        return distritoMapper.consultar(entidad, new RowBounds(desde, hasta));
    }

}

package com.prog3.ApiRest.services;

import com.prog3.ApiRest.entities.Base;

import javax.swing.text.html.parser.Entity;
import java.io.Serializable;
import java.util.List;

//Que reciba cualquier tipo de entidad
public interface BaseService<E extends Base, ID extends Serializable>{
    public List<E> findAll() throws Exception;

    public E findById(ID id) throws Exception;

    public E save(E entity) throws Exception;

    public E update(ID id, E entity) throws Exception;

    public boolean delete(ID id) throws Exception;
}

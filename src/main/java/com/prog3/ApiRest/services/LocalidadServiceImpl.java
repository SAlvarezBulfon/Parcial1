package com.prog3.ApiRest.services;

import com.prog3.ApiRest.entities.Localidad;
import com.prog3.ApiRest.entities.Persona;
import com.prog3.ApiRest.repositories.LocalidadRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LocalidadServiceImpl extends BaseServiceImpl<Localidad,Long> implements LocalidadService {
    @Autowired
    private LocalidadRepository localidadRepository;
}

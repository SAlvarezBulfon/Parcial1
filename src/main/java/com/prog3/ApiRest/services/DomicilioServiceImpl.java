package com.prog3.ApiRest.services;

import com.prog3.ApiRest.entities.Domicilio;

import com.prog3.ApiRest.repositories.DomicilioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DomicilioServiceImpl extends BaseServiceImpl<Domicilio,Long>implements DomicilioService {
    @Autowired
    private DomicilioRepository domicilioRepository;
}

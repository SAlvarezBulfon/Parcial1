package com.prog3.ApiRest.services;

import com.prog3.ApiRest.entities.Autor;
import com.prog3.ApiRest.repositories.AutorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AutorServiceImpl extends BaseServiceImpl<Autor,Long> implements AutorService {

    @Autowired
    private AutorRepository autorRepository;
}

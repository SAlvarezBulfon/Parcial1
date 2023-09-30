package com.prog3.ApiRest.services;


import com.prog3.ApiRest.entities.Libro;
import com.prog3.ApiRest.repositories.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LibroServiceImpl extends BaseServiceImpl<Libro,Long>implements LibroService {

    @Autowired
    private LibroRepository libroRepository;
}

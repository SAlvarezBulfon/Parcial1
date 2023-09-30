package com.prog3.ApiRest.controllers;


import com.prog3.ApiRest.entities.Localidad;
import com.prog3.ApiRest.entities.Persona;
import com.prog3.ApiRest.services.LocalidadServiceImpl;
import com.prog3.ApiRest.services.PersonaServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/localidades")
public class LocalidadController extends BaseControllerImpl<Localidad, LocalidadServiceImpl> {
}

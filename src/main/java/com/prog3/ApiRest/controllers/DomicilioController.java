package com.prog3.ApiRest.controllers;

import com.prog3.ApiRest.entities.Domicilio;
import com.prog3.ApiRest.services.DomicilioServiceImpl;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*")
@RequestMapping(path = "api/v1/domicilios")

public class DomicilioController extends BaseControllerImpl<Domicilio, DomicilioServiceImpl> {
}

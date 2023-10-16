package com.prog3.ApiRest.controllers;

import com.prog3.ApiRest.entities.Base;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import java.io.Serializable;

public interface BaseController <E extends Base, ID extends Serializable> {
    public ResponseEntity<?> findAll();
    public ResponseEntity<?> findAll(Pageable pageable);
    public ResponseEntity<?> findById(@PathVariable ID id);
    public ResponseEntity<?> save(@RequestBody  E entity);
    public ResponseEntity<?> update(@PathVariable ID id, @RequestBody  E entity);
    public  ResponseEntity<?> delete(@PathVariable ID id);
}

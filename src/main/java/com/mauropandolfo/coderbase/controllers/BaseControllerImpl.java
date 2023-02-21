package com.mauropandolfo.coderbase.controllers;

import com.mauropandolfo.coderbase.entites.Base;
import com.mauropandolfo.coderbase.entites.Candidate;
import com.mauropandolfo.coderbase.services.BaseService;
import com.mauropandolfo.coderbase.services.BaseServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.yaml.snakeyaml.events.Event;

import java.io.Serializable;

public abstract class BaseControllerImpl <E extends Base, S extends BaseServiceImpl<E, Long>> implements BaseController<E, Long>{

    @Autowired
    protected S service;


    @GetMapping("")
    public ResponseEntity<?> getAll(){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"Ocurrio un error, intente mas tarde.\"}");
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getOne(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.findById(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"Ocurrio un error, intente mas tarde.\"}");
        }
    }
    @PostMapping("")
    public ResponseEntity<?>save(@RequestBody E candidate){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.save(candidate));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("{\"ERROR\":\"Ocurrio un error, intente mas tarde.\"}");
        }
    }
    @PutMapping("/{id}")
    public ResponseEntity<?>update(@PathVariable Long id,@RequestBody E candidate){
        try{
            return ResponseEntity.status(HttpStatus.OK).body(service.update(id, candidate));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"Ocurrio un error, intente mas tarde.\"}");
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<?>delete(@PathVariable Long id){
        try{
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(service.delete(id));
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("{\"ERROR\":\"Ocurrio un error, intente mas tarde.\"}");
        }
    }
}

package com.eventos.eventos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eventos.eventos.model.Evento;
import com.eventos.eventos.service.Evservice;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/eventos")
public class eventocontroller {

    @Autowired
    private Evservice evservice;

    @GetMapping
    public List<Evento> findAll() {
        return evservice.findAll();
    }

    @PostMapping
    public Evento create(@RequestBody Evento evento){
        return evservice.create(evento);
    }
    
    @PutMapping
    public Evento update(@RequestBody Evento evento){
        return evservice.update(evento);
    }
    
    @GetMapping("/{id}")
    public Evento findById(@PathVariable("id") Integer idevento){
        return evservice.findById(idevento);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Integer idevento){
        evservice.delete(idevento);
    }
}

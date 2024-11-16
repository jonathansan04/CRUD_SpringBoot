package com.eventos.eventos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.eventos.eventos.model.Evento;
import com.eventos.eventos.repository.Cliente;

@Service
public class Evservice implements eventoservice{

    @Autowired
    private Cliente eventoRepo;

    @Override
    public Evento create(Evento evento){
        return eventoRepo.save(evento);
    }

    @Override
    public Evento update(Evento evento){
        return eventoRepo.save(evento);
    }

    @Override
    public Evento findById(Integer idevento){
       Optional<Evento> eventOpcional = eventoRepo.findById(idevento);
       return eventOpcional.orElse(null);
    }

    @Override
    public List<Evento> findAll(){
        return eventoRepo.findAll();
    }

    @Override
    public void delete(Integer idevento){
        eventoRepo.deleteById(idevento);
    }
}

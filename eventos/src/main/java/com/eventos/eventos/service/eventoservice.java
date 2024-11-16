package com.eventos.eventos.service;

import java.util.List;

import com.eventos.eventos.model.Evento;

public interface eventoservice {
    Evento create(Evento evento);
    Evento update(Evento evento);
    Evento findById(Integer idevento);

    List<Evento> findAll();

    void delete(Integer idevento);
    
}

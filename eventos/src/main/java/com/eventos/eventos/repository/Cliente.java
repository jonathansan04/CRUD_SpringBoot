package com.eventos.eventos.repository;

import com.eventos.eventos.model.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Cliente extends JpaRepository<Evento, Integer> {
 
}

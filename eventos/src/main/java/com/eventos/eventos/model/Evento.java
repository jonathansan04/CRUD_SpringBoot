package com.eventos.eventos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name= "evento")
public class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idevento;
    
    @Column(name = "nombrevento", nullable =false, length =50)
    private String nombrevento;

    @Column(name = "direccion", nullable =false, length =50)
    private String direccion;
    
    @Column(name = "cantidadp", nullable =false)
    private Integer cantidadp;

    public Integer getIdevento() {
        return idevento;
    }

    public void setIdevento(Integer idevento) {
        this.idevento = idevento;
    }

    public String getNombrevento() {
        return nombrevento;
    }

    public void setNombrevento(String nombrevento) {
        this.nombrevento = nombrevento;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setdDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Integer getCantidadp() {
        return cantidadp;
    }

    public void setdCantidadp(Integer cantidadp) {
        this.cantidadp = cantidadp;
    }

}

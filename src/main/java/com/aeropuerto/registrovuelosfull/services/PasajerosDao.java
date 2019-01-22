package com.aeropuerto.registrovuelosfull.services;

import com.aeropuerto.registrovuelosfull.repository.IPasajeroRepository;

import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PasajerosDao {

    @Autowired
    IPasajeroRepository iPasajeroRepository;

    public List<Pasajero> findAllPasajeros() {
        return iPasajeroRepository.findAll();

    }
}

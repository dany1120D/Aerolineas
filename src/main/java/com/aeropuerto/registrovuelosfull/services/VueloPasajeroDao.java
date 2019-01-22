package com.aeropuerto.registrovuelosfull.services;

import com.aeropuerto.registrovuelosfull.repository.IPasajeroRepository;
import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Service
public class VueloPasajeroDao {

    @Autowired
    IPasajeroRepository iPasajeroRepository;

    public boolean postPasajero(int id_vuelo, Pasajero pasajero) {
        pasajero.setVuelo(new Vuelo(id_vuelo));

        return iPasajeroRepository.save(pasajero)!= null ?true :false;
    }

    public List<Pasajero> personasPorVuelo(int id_vuelo) {

        return iPasajeroRepository.findByVuelo_Idvuelo(id_vuelo);
    }
}

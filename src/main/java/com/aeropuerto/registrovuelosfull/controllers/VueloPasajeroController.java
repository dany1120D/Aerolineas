package com.aeropuerto.registrovuelosfull.controllers;



import com.aeropuerto.registrovuelosfull.services.VueloPasajeroDao;
import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/vuelos")
public class VueloPasajeroController {

    @Autowired
    VueloPasajeroDao vueloPasajeroDao;

    @PostMapping("/{id_vuelo}/pasajeros")
    public boolean postPasajerosDeVuelo(
            @PathVariable("id_vuelo") int id_vuelo,
            @RequestBody Pasajero pasajero
            ){
        return vueloPasajeroDao.postPasajero(id_vuelo,pasajero);
    }

    @GetMapping("/{id_vuelo}/pasajeros/{id_pasajero}")
    public Pasajero getUnPasajeroDeVuelo(){
        return null;
    }

    @GetMapping("/{id_vuelo}/pasajeros")
    public List<Pasajero> getPasajerosDeVuelo(@PathVariable int id_vuelo){
        return vueloPasajeroDao.personasPorVuelo(id_vuelo);

    }

}

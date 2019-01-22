package com.aeropuerto.registrovuelosfull.controllers;


import com.aeropuerto.registrovuelosfull.services.PasajerosDao;
import com.aeropuerto.registrovuelosfull.services.VuelosDao;
import com.aeropuerto.registrovuelosfull.utileria.Pasajero;
import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PasajeroController {

    @Autowired
    PasajerosDao pasajerosDao;


    @RequestMapping(value="/pasajeros", method = RequestMethod.GET)
    public List<Pasajero> getPasajeros(){

        return pasajerosDao.findAllPasajeros();
    }
    @PostMapping("/pasajeros")
    public boolean postPasajero(@RequestBody Pasajero pasajero,@PathVariable ("vuelo_id_vuelo")int id_vuelo){
    return true;
    }




}

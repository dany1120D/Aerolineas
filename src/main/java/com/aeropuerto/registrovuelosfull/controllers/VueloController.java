package com.aeropuerto.registrovuelosfull.controllers;

import com.aeropuerto.registrovuelosfull.services.VuelosDao;
import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vuelos")
public class VueloController {

    @Autowired
    VuelosDao vuelosDao;

    @GetMapping("")
    public List<Vuelo> getVuelos(){

        return vuelosDao.findAllVuelos();

    }

    @PostMapping("")
    public boolean postVuelo(@RequestBody Vuelo vuelo){

        return vuelosDao.posteaVuelo(vuelo);
    }

    @GetMapping("/{id_vuelo}")
    public Vuelo  getVueloPorId(@PathVariable("id_vuelo")int id_vuelo){

        return vuelosDao.getVueloporId(id_vuelo);
    }

    @PutMapping("/{id_vuelo}")
    public boolean putVuelo(@PathVariable("id_vuelo") int id_vuelo, @RequestBody Vuelo vuelo ){
        return vuelosDao.putdeVuelo(id_vuelo,vuelo);

    }






}

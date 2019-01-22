package com.aeropuerto.registrovuelosfull.repository;

import com.aeropuerto.registrovuelosfull.utileria.Pasajero;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface IPasajeroRepository extends JpaRepository<Pasajero,Integer> {

    List<Pasajero> findByVuelo_Idvuelo(int id_vuelo);
}

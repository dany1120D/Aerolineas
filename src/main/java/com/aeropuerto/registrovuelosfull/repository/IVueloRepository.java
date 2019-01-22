package com.aeropuerto.registrovuelosfull.repository;

import com.aeropuerto.registrovuelosfull.utileria.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IVueloRepository extends JpaRepository<Vuelo,Integer> {
}

package com.aeropuerto.registrovuelosfull.utileria;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.annotation.Generated;
import javax.persistence.*;

@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Pasajero {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id_Boleto;

    @Column
    private String nombre;

    @Column
    private String asiento;

    @ManyToOne
    private Vuelo vuelo;



}

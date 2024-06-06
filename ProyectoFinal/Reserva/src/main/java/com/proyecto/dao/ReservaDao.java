package com.proyecto.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.proyecto.model.Reserva;

public interface ReservaDao extends JpaRepository<Reserva, Integer>{

}

package com.br.hotel.database;

import com.br.hotel.database.entity.Reserva;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IReservaRepository extends JpaRepository<Reserva, Long>{
}

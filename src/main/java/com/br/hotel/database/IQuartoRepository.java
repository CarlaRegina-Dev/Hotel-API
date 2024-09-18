package com.br.hotel.database;

import com.br.hotel.database.entity.ReservaEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IQuartoRepository extends JpaRepository<ReservaEntity, Long> {
}

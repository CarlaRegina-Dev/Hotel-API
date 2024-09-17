package com.br.hotel.mapper;

import com.br.hotel.controller.dto.ReservaResquest;
import com.br.hotel.domain.model.Reserva;
import org.mapstruct.factory.Mappers;

public interface ReservaMapper {

    ReservaMapper INSTANCE = Mappers.getMapper(ReservaMapper.class);

    Reserva toEntityIncluirReserva(ReservaResquest request);
}

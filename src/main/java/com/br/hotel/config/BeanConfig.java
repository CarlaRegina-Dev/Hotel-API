package com.br.hotel.config;

import com.br.hotel.controller.dto.UsuarioRequest;
import com.br.hotel.database.IUsuarioRepository;
import com.br.hotel.database.entity.UsuarioEntity;
import com.br.hotel.domain.model.Usuario;
import com.br.hotel.domain.service.UsuarioService;
import com.br.hotel.mapper.UsuarioMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfig {

    @Bean
    public UsuarioService usuarioService( IUsuarioRepository repository) {
        return new UsuarioService(repository);  // Criação manual do bean
    }
}

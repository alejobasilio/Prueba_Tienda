package com.alejobasilio.pruba_tienda.config;

import org.mapstruct.factory.Mappers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.alejobasilio.pruba_tienda.business.mappers.PedidoMapper;

@Configuration
public class MapperConfig {
    @Bean
    public PedidoMapper pedidoMapper() {
        return Mappers.getMapper(PedidoMapper.class);
    }
}


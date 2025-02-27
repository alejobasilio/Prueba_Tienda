package com.alejobasilio.pruba_tienda.business.services;

import java.util.List;
import java.util.Optional;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;

public interface PedidoService {
	
    PedidoDTOSalida transformarPedido(PedidoDTOEntrada pedidoDTO);
    
    Optional<PedidoDTOSalida> obtenerPedidoPorId(Long id);
    
    List<PedidoDTOSalida> obtenerTodosLosPedidos();
    
    void borrarPedidoById(Long id);
}

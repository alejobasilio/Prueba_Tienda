package com.alejobasilio.pruba_tienda.business.services;

import java.util.List;
import java.util.Optional;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;

/**
 * Interfaz que define los métodos para gestionar pedidos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
public interface PedidoService {
	
	  /**
     * Método que transforma un objeto de tipo {@link PedidoDTOEntrada} en un objeto de tipo {@link PedidoDTOSalida}.
     * 
     */
    PedidoDTOSalida transformarPedido(PedidoDTOEntrada pedidoDTO);
    
    /**
     * Método que obtiene un pedido por id.
     * 
     */
    Optional<PedidoDTOSalida> obtenerPedidoPorId(Long id);
    
    /**
     * Método que obtiene una lista de todos los pedidos.
     * 
     */
    List<PedidoDTOSalida> obtenerTodosLosPedidos();
    
    /**
     * Método que borra un pedido por su ID.
     * 
     */
    void borrarPedidoById(Long id);
}

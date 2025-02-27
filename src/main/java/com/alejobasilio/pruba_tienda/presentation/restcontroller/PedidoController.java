package com.alejobasilio.pruba_tienda.presentation.restcontroller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.services.PedidoService;

/**
 * Controlador REST que maneja las solicitudes relacionadas con pedidos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

	private PedidoService pedidoService;
	
	
	
	public PedidoController(PedidoService pedidoService) {
		super();
		this.pedidoService = pedidoService;
	}



	/**
     * Método que crea un nuevo pedido.
     * 
     */
	@PostMapping
    public PedidoDTOSalida crearPedido(@RequestBody PedidoDTOEntrada pedidoDTO) {
        return pedidoService.transformarPedido(pedidoDTO);
    }
	
    /**
     * Método que borra un pedido por su ID.
     * 
     */
	@DeleteMapping("/{id}")
	public void borrarPedido(@PathVariable Long id) {
	    pedidoService.borrarPedidoById(id);
	}
}

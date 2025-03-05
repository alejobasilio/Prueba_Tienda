package com.alejobasilio.pruba_tienda.presentation.restcontroller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.services.PedidoService;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;

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
	@ResponseStatus(HttpStatus.CREATED)
	@Operation(summary = "Crear un nuevo pedido", description = "Crea un nuevo pedido con los datos proporcionados")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "Pedido creado correctamente", content = @Content(schema = @Schema(implementation = PedidoDTOSalida.class))),
			@ApiResponse(responseCode = "400", description = "Datos de pedido inválidos") 
		})
	public PedidoDTOSalida crearPedido(@RequestBody PedidoDTOEntrada pedidoDTO) {
		return pedidoService.transformarPedido(pedidoDTO);
	}

	/**
	 * Método que borra un pedido por su ID.
	 * 
	 */
	@Operation(summary = "Borrar un pedido", description = "Borra un pedido por su ID")
	@ApiResponses(value = { @ApiResponse(responseCode = "204", description = "Pedido borrado correctamente"),
			@ApiResponse(responseCode = "404", description = "Pedido no encontrado") 
	})
	@DeleteMapping("/{id}")
	public void borrarPedido(@PathVariable Long id) {
		pedidoService.borrarPedidoById(id);
	}
}

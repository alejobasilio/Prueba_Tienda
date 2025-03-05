package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;


/**
 * Clase que representa los productos de un pedido.
 * Los Dtos que contienen la palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class PedidoDTOSalida {


    @Schema(description = "ID del pedido", example = "1")
    private Long id;
    
    @ArraySchema(schema = @Schema(implementation = ProductoDTOSalida.class))
	private List<ProductoDTOSalida> carrito;
}

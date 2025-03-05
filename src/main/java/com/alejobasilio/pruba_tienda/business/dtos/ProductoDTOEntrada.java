package com.alejobasilio.pruba_tienda.business.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa los productos de un pedido.
 * Los Dtos que contienen la palabra entrada son Clases que envia el usuario 
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class ProductoDTOEntrada {
	
	@Schema(description = "ID del producto", example = "1")
	private Long id;
}

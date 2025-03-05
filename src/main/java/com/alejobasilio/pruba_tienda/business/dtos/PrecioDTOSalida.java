package com.alejobasilio.pruba_tienda.business.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa el precio de un producto.
 * Los Dtos que contienen la palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */

@Getter
@Setter
public class PrecioDTOSalida {

	@Schema(description = "Moneda del producto", example = "€")
	private String moneda;
	
	@Schema(description = "Precio del producto", example = "25")
	private Double valor;
}

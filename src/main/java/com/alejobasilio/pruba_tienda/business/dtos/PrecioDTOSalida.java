package com.alejobasilio.pruba_tienda.business.dtos;

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

	private String moneda;
	private Double valor;
}

package com.alejobasilio.pruba_tienda.business.dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
/**
 * Clase que representa las características de un producto.
 * Los Dtos que contienen la palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
public class CaracteristicasDTOSalida {

	private String nombre;
	private String valor;
}

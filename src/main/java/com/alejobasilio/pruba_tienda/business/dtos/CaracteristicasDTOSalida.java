package com.alejobasilio.pruba_tienda.business.dtos;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;


/**
 * Clase que representa las características de un producto.
 * Los Dtos que contienen la palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class CaracteristicasDTOSalida {

	@Schema(description = "Nombre de la característica", example = "Color")
	private String nombre;
	
	@Schema(description = "Valor de la característica", example = "Rojo")
	private String valor;
}

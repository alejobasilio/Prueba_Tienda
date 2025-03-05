package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa los productos de un producto. Los Dtos que contienen la
 * palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class ProductoDTOSalida {

	@Schema(description = "ID del producto", example = "1")
	private Long id;

	@Schema(description = "Nombre del producto", example = "iPhone 13")
	private String nombre;

	@Schema(description = "Marca del producto", example = "Apple")
	private String marca;

	@Schema(description = "Precio del producto")
	private PrecioDTOSalida precio;

	@Schema(description = "Características del producto", implementation = CaracteristicasDTOSalida.class)
	private List<CaracteristicasDTOSalida> caracteristicas;
}

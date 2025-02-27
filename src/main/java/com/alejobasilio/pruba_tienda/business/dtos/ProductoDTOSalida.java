package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa los productos de un producto.
 * Los Dtos que contienen la palabra salida son Clases que se devolveran al usuario
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class ProductoDTOSalida {

	private Long id;
	private String nombre;
	private String marca;
	private PrecioDTOSalida precio;
	private List<CaracteristicasDTOSalida> caracteristicas;
}

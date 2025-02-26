package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ProductoDTOSalida {

	private Long id;
	private String nombre;
	private String marca;
	private PrecioDTOSalida precio;
	private List<CaracteristicasDTOSalida> caracteristicas;
}

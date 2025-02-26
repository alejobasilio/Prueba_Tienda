package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CarritoDTOEntrada {

	private List<ProductoDTOEntrada> productos;
}

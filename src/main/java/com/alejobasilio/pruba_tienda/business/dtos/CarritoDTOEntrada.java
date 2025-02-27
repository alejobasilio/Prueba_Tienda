package com.alejobasilio.pruba_tienda.business.dtos;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

/**
 * Clase que representa la lista de productos de un pedido.
 * Los Dtos que contienen la palabra entrada son Clases que envia el usuario 
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
@Setter
public class CarritoDTOEntrada {

	private List<ProductoDTOEntrada> productos;
}

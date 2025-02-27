package com.alejobasilio.pruba_tienda.business.dtos;

import lombok.Getter;

/**
 * Clase que representa la entrada de un pedido.
 * Los Dtos que contienen la palabra entrada son Clases que envia el usuario 
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
@Getter
public class PedidoDTOEntrada {

	private CarritoDTOEntrada carrito;
}

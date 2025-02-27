package com.alejobasilio.pruba_tienda.integration.model;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que representa un precio.
 * 
 * Un pedido es una entidad que contiene el tipo de moneda y el valor.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class Precio {
	
	private String moneda;
	
	@Column(name = "valor_producto")
	private Double valor;
	
	
}

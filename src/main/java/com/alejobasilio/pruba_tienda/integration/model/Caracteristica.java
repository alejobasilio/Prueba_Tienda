package com.alejobasilio.pruba_tienda.integration.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que representa un Caracteristicas.
 * 
 * Un pedido es una entidad que contiene un nombre y un valor.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 */

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
public class Caracteristica {

	private String nombre; 
	private String valor; 
}

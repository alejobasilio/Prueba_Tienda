package com.alejobasilio.pruba_tienda.integration.model;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Embeddable
class Precio {
	
	private String moneda;
	private Double valor;
	
	
}

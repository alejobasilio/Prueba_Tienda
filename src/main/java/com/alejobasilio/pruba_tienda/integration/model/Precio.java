package com.alejobasilio.pruba_tienda.integration.model;

import jakarta.persistence.Column;
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
public class Precio {
	
	private String moneda;
	
	@Column(name = "valor_producto")
	private Double valor;
	
	
}

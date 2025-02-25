package com.alejobasilio.pruba_tienda.integration.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUCTO")
class Producto {

	private Long id;
	private String nombre;
	private String marca;
	private Precio precio;
	
}

package com.alejobasilio.pruba_tienda.integration.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
class Pedido {

	private Long id;
	private List<Producto> listaProductos;
}

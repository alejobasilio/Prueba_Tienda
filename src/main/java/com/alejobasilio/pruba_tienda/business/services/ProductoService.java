package com.alejobasilio.pruba_tienda.business.services;

import java.util.List;
import java.util.Optional;

import com.alejobasilio.pruba_tienda.integration.model.Producto;

public interface ProductoService {

	List<Producto> obtenerProductos();
	
	Optional<Producto> obtenerProductoPorId(Long id);
	
	void crearProducto(Producto producto);

	void eliminarProducto(Long id);
}

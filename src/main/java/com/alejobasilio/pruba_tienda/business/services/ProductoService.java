package com.alejobasilio.pruba_tienda.business.services;

import java.util.List;
import java.util.Optional;

import com.alejobasilio.pruba_tienda.integration.model.Producto;

/**
 * Interfaz que define los métodos para gestionar productos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
public interface ProductoService {

	/**
	 * Método que obtiene una lista de todos los productos.
	 * 
	 */
	List<Producto> obtenerProductos();

	/**
	 * Método que obtiene un producto por su ID.
	 * 
	 */
	Optional<Producto> obtenerProductoPorId(Long id);

	/**
	 * Método que crea un nuevo producto.
	 * 
	 */
	void crearProducto(Producto producto);

	/**
     * Método que elimina un producto por su ID.
     * 
     */
	void eliminarProducto(Long id);
}

package com.alejobasilio.pruba_tienda.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejobasilio.pruba_tienda.integration.model.Producto;

/**
 * Repositorio para interactuar con la tabla de productos.
 * 
 * Este repositorio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla de productos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 */
public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

package com.alejobasilio.pruba_tienda.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.alejobasilio.pruba_tienda.integration.model.Pedido;

/**
 * Repositorio para interactuar con la tabla de pedidos.
 * 
 * Este repositorio proporciona métodos para realizar operaciones CRUD (Crear, Leer, Actualizar, Eliminar) en la tabla de pedidos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 */
public interface PedidoRepository extends JpaRepository<Pedido, Long> {

	/**
	 * Método que devuelve una lista pedidos por ids
	 * @param ids List<Long> 
	 * @return
	 */
	@Query("SELECT DISTINCT p FROM Pedido p JOIN p.listaProductos lp WHERE lp.id IN :ids")
	List<Pedido> pedidosPorIds(@RequestParam("ids") List<Long> ids);

}

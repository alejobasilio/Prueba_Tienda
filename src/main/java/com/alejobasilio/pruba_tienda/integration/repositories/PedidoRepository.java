package com.alejobasilio.pruba_tienda.integration.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.web.bind.annotation.RequestParam;

import com.alejobasilio.pruba_tienda.integration.model.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Long>{

	@Query("SELECT p FROM Pedido p WHERE p.carrito.id IN :ids")
	List<Pedido> pedidosPorIds (@RequestParam("ids") List<String> ids);
}

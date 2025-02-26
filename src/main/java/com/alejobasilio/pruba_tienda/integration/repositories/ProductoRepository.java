package com.alejobasilio.pruba_tienda.integration.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.alejobasilio.pruba_tienda.integration.model.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

}

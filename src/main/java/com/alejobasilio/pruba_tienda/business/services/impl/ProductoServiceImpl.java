package com.alejobasilio.pruba_tienda.business.services.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alejobasilio.pruba_tienda.business.services.ProductoService;
import com.alejobasilio.pruba_tienda.integration.model.Producto;
import com.alejobasilio.pruba_tienda.integration.repositories.ProductoRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class ProductoServiceImpl implements ProductoService {

	private ProductoRepository productoRepository;

	@Override
	public List<Producto> obtenerProductos() {
		return productoRepository.findAll();
	}

	@Override
	public Optional<Producto> obtenerProductoPorId(Long id) {
		return productoRepository.findById(id);
	}

	@Override
	@Transactional
	public void crearProducto(Producto producto) {

		if (producto.getId() != null) {
			throw new IllegalStateException("Para crear un producto el id tiene que ser null");
		}
		productoRepository.save(producto);

	}

	@Override
	@Transactional
	public void eliminarProducto(Long id) {
		boolean existe = productoRepository.existsById(id);
		
		if (!existe) {
			throw new IllegalStateException("El producto con ID [" + id + "] no existe.");
		}
		productoRepository.deleteById(id);
	}

}

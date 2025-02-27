package com.alejobasilio.pruba_tienda.business.services.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.mappers.PedidoMapper;
import com.alejobasilio.pruba_tienda.business.services.PedidoService;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Producto;
import com.alejobasilio.pruba_tienda.integration.repositories.PedidoRepository;
import com.alejobasilio.pruba_tienda.integration.repositories.ProductoRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class PedidoServicesImpl implements PedidoService {

	private PedidoRepository pedidoRepository;
	private ProductoRepository productoRepository;
	private PedidoMapper pedidoMapper;

	@Override
	public PedidoDTOSalida transformarPedido(PedidoDTOEntrada pedidoDTO) {

		Pedido pedido = new Pedido();

		List<Producto> productos = new ArrayList<>();
		for (ProductoDTOEntrada productoDTO : pedidoDTO.getCarrito().getProductos()) {
			Optional<Producto> producto = productoRepository.findById(productoDTO.getId());
			if (producto.isPresent()) {
				productos.add(producto.get());
			}
		}

		pedido.setListaProductos(productos);

		pedido = pedidoRepository.save(pedido);

		return pedidoMapper.pedidoPedidoDTOSalida(pedido);
	}

	@Override
	public Optional<PedidoDTOSalida> obtenerPedidoPorId(Long id) {
		Optional<Pedido> pedidoOptional = pedidoRepository.findById(id);
		if (pedidoOptional.isPresent()) {
			return Optional.of(pedidoMapper.pedidoPedidoDTOSalida(pedidoOptional.get()));
		} else {
			return Optional.empty();
		}
	}

	@Override
	public List<PedidoDTOSalida> obtenerTodosLosPedidos() {
		List<Pedido> pedidos = pedidoRepository.findAll();
		List<PedidoDTOSalida> pedidosDTOSalida = new ArrayList<>();

		for (Pedido pedido : pedidos) {
			PedidoDTOSalida pedidoDTOSalida = pedidoMapper.pedidoPedidoDTOSalida(pedido);
			pedidosDTOSalida.add(pedidoDTOSalida);
		}
		return pedidosDTOSalida;
	}

}

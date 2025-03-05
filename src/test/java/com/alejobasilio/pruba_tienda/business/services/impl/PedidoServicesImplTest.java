package com.alejobasilio.pruba_tienda.business.services.impl;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.only;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import static org.mockito.BDDMockito.given;
import static org.mockito.BDDMockito.willDoNothing;
import static org.mockito.Mockito.verify;

import com.alejobasilio.pruba_tienda.business.dtos.CarritoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOEntrada;
import com.alejobasilio.pruba_tienda.business.mappers.PedidoMapperImpl;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Producto;
import com.alejobasilio.pruba_tienda.integration.repositories.PedidoRepository;
import com.alejobasilio.pruba_tienda.integration.repositories.ProductoRepository;

@ExtendWith(MockitoExtension.class)
class PedidoServicesImplTest {

	@Mock
	private PedidoRepository pedidoRepository;

	@Mock
	private PedidoMapperImpl pedidoMapperImpl;
	@Mock
	private ProductoRepository productoRepository;

	@InjectMocks
	private PedidoServicesImpl pedidoServicesImpl;

	// JUnit test for
	@Test
	void givenPedidoDTOEntrada_whenTransformarPedido_thenReturnPedidoDTOSalida() {

		// given - precondition or setup
		PedidoDTOEntrada pedidoDTOEntrada = new PedidoDTOEntrada();
		pedidoDTOEntrada.setCarrito(new CarritoDTOEntrada());
		pedidoDTOEntrada.getCarrito().setProductos(new ArrayList());
		ProductoDTOEntrada productoDTOEntrada = new ProductoDTOEntrada();
		productoDTOEntrada.setId(1L);
		pedidoDTOEntrada.getCarrito().getProductos().add(productoDTOEntrada);
		PedidoDTOSalida pedidoDTOSalida = new PedidoDTOSalida();
		pedidoDTOSalida.setId(1L);

		when(pedidoRepository.save(any(Pedido.class))).thenReturn(new Pedido());
		when(productoRepository.findById(any(Long.class))).thenReturn(Optional.of(new Producto()));
		when(pedidoMapperImpl.pedidoPedidoDTOSalida(any(Pedido.class))).thenReturn(pedidoDTOSalida);
		// when - action or the behavior that we are going test

		PedidoDTOSalida pedidoDTOSalidaSaved = pedidoServicesImpl.transformarPedido(pedidoDTOEntrada);

		// then - verify the output
		assertNotNull(pedidoDTOSalidaSaved);
	}

	// JUnit test for
	@Test
	void givenPedidoId_whenObtenerPedidoPorId_thenReturnOptionalPedidoDTOSalida() {

		// given - precondition or setup
		Pedido pedido = new Pedido();
		pedido.setId(1L);

		PedidoDTOSalida pedidoDTOSalida = new PedidoDTOSalida();
		pedidoDTOSalida.setId(1L);

		when(pedidoRepository.findById(1L)).thenReturn(Optional.of(pedido));
		when(pedidoMapperImpl.pedidoPedidoDTOSalida(any(Pedido.class))).thenReturn(pedidoDTOSalida);

		// when - action or the behavior that we are going test

		Optional<PedidoDTOSalida> pedidoSaved = pedidoServicesImpl.obtenerPedidoPorId(1L);

		// then - verify the output
		assertEquals(pedidoSaved.get().getId(), 1L);
	}

	@Test
	void givenPedidoId_whenObtenerPedidoPorId_thenReturnOptionalEmpty() {

		// given - precondition or setup
		Pedido pedido = new Pedido();
		pedido.setId(1L);

		when(pedidoRepository.findById(1L)).thenReturn(Optional.empty());

		// when - action or the behavior that we are going test

		Optional<PedidoDTOSalida> pedidoSaved = pedidoServicesImpl.obtenerPedidoPorId(1L);

		// then - verify the output
		assertThat(pedidoSaved).isEmpty();
	}

	// JUnit test for
	@Test
	void given_whenObtenerTodosLosPedidos_thenReturnPedidoDTOSalida() {

		// given - precondition or setup
		Pedido pedido = new Pedido();
		pedido.setId(1L);
		List<Pedido> listaPedidos = List.of(pedido);

		PedidoDTOSalida pedidoDTOSalida = new PedidoDTOSalida();
		pedidoDTOSalida.setId(1L);

		when(pedidoRepository.findAll()).thenReturn(listaPedidos);
		when(pedidoMapperImpl.pedidoPedidoDTOSalida(pedido)).thenReturn(pedidoDTOSalida);

		// when - action or the behavior that we are going test

		List<PedidoDTOSalida> listaPedidosDTOSalida = pedidoServicesImpl.obtenerTodosLosPedidos();

		// then - verify the output
		assertNotNull(listaPedidosDTOSalida);
	}

	// JUnit test for
	@Test
	void givenPedidoId_whenBorrarPedidoById_thenNothing() {

		// given - precondition or setup
		
		willDoNothing().given(pedidoRepository).deleteById(1L);;

		// when - action or the behavior that we are going test

		pedidoServicesImpl.borrarPedidoById(1L);

		// then - verify the output
		verify(pedidoRepository, only()).deleteById(1L);
	}
}

package com.alejobasilio.pruba_tienda.business.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;

import static org.mockito.ArgumentMatchers.booleanThat;
import static org.mockito.ArgumentMatchers.intThat;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

import org.mockito.junit.jupiter.MockitoExtension;

import com.alejobasilio.pruba_tienda.business.dtos.CaracteristicasDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PrecioDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOSalida;
import com.alejobasilio.pruba_tienda.integration.model.Caracteristica;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Precio;
import com.alejobasilio.pruba_tienda.integration.model.Producto;

@ExtendWith(MockitoExtension.class)
class PedidoMapperImplTest {

	@InjectMocks
	private PedidoMapperImpl pedidoMapper;

	@Test
	void testProductoProductoDTOSalida() {
		// given
		Producto producto = new Producto();
		producto.setId(1L);
		producto.setNombre("Nombre del producto");
		producto.setMarca("Marca del producto");

		// when
		ProductoDTOSalida productoDTOSalida = pedidoMapper.productoProductoDTOSalida(producto);

		// then
		assertNotNull(productoDTOSalida);
		assertEquals(1L, productoDTOSalida.getId());
		assertEquals("Nombre del producto", productoDTOSalida.getNombre());
		assertEquals("Marca del producto", productoDTOSalida.getMarca());
	}

	@Test
	void testCaracteristicaCaracteristicasDTOSalida() {
		// given
		Caracteristica caracteristica = new Caracteristica();
		caracteristica.setNombre("Nombre de la caracteristica");
		caracteristica.setValor("Valor de la caracteristica");

		// when
		CaracteristicasDTOSalida caracteristicasDTOSalida = pedidoMapper
				.caracteristicaCaracteristicasDTOSalida(caracteristica);

		// then
		assertNotNull(caracteristicasDTOSalida);
		assertEquals("Nombre de la caracteristica", caracteristicasDTOSalida.getNombre());
		assertEquals("Valor de la caracteristica", caracteristicasDTOSalida.getValor());
	}

	@Test
	void testPrecioPrecioDTOSalida() {
		// given
		Precio precio = new Precio();
		precio.setMoneda("Moneda del precio");
		precio.setValor(10.99);

		// when
		PrecioDTOSalida precioDTOSalida = pedidoMapper.precioPrecioDTOSalida(precio);

		// then
		assertNotNull(precioDTOSalida);
		assertEquals("Moneda del precio", precioDTOSalida.getMoneda());
		assertEquals(10.99, precioDTOSalida.getValor(), 0.01);
	}

	@Test
	void testPedidoPedidoDTOSalida() {

		// given
		Pedido pedido = new Pedido();
		pedido.setId(1L);
		pedido.setListaProductos(new ArrayList<>());

		Producto producto = new Producto();
		producto.setId(1L);
		producto.setNombre("Nombre del producto");
		producto.setMarca("Marca del producto");
		producto.setPrecio(new Precio());
		producto.setCaracteristicas(new ArrayList<>());
		Caracteristica caracteristica = new Caracteristica();
		producto.getCaracteristicas().add(caracteristica);
		pedido.getListaProductos().add(producto);

		CaracteristicasDTOSalida caracteristicasDTOSalida = new CaracteristicasDTOSalida();

		// when
		PedidoDTOSalida pedidoDTOSalida = pedidoMapper.pedidoPedidoDTOSalida(pedido);

		// then
		assertNotNull(pedidoDTOSalida);
		
	}

}
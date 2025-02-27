package com.alejobasilio.pruba_tienda.business.mappers;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.alejobasilio.pruba_tienda.business.dtos.CaracteristicasDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PrecioDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOSalida;
import com.alejobasilio.pruba_tienda.integration.model.Caracteristica;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Precio;
import com.alejobasilio.pruba_tienda.integration.model.Producto;

@Service
public class PedidoMapperImpl implements PedidoMapper {

	@Override
	public ProductoDTOSalida productoProductoDTOSalida(Producto producto) {
		ProductoDTOSalida productoDTOSalida = new ProductoDTOSalida();
		productoDTOSalida.setId(producto.getId());
		productoDTOSalida.setNombre(producto.getNombre());
		productoDTOSalida.setMarca(producto.getMarca());
		return productoDTOSalida;
	}

	@Override
	public CaracteristicasDTOSalida caracteristicaCaracteristicasDTOSalida(Caracteristica caracteristica) {
		 CaracteristicasDTOSalida caracteristicasDTOSalida = new CaracteristicasDTOSalida();
	        caracteristicasDTOSalida.setNombre(caracteristica.getNombre());
	        caracteristicasDTOSalida.setValor(caracteristica.getValor());
	        return caracteristicasDTOSalida;
	}

	@Override
	public PrecioDTOSalida precioPrecioDTOSalida(Precio precio) {
		PrecioDTOSalida precioDTOSalida = new PrecioDTOSalida();
        precioDTOSalida.setMoneda(precio.getMoneda());
        precioDTOSalida.setValor(precio.getValor());
        return precioDTOSalida;
	}

	@Override
	public PedidoDTOSalida pedidoPedidoDTOSalida(Pedido pedido) {
		
		PedidoDTOSalida pedidoDTOSalida = new PedidoDTOSalida();
	    pedidoDTOSalida.setId(pedido.getId());
	    List<ProductoDTOSalida> productosDTOSalida = new ArrayList();
	    
	    for (Producto producto : pedido.getListaProductos()) {
	        ProductoDTOSalida productoDtoSalida = new ProductoDTOSalida();
	        productoDtoSalida.setId(producto.getId());
	        productoDtoSalida.setNombre(producto.getNombre());
	        productoDtoSalida.setMarca(producto.getMarca());
	        productoDtoSalida.setPrecio(precioPrecioDTOSalida(producto.getPrecio()));
	        
	        List<CaracteristicasDTOSalida> list = new ArrayList(); 
	        for(Caracteristica caracteristica : producto.getCaracteristicas()) {
	        	list.add(caracteristicaCaracteristicasDTOSalida(caracteristica));
	        }
	        
	        productoDtoSalida.setCaracteristicas(list);
	        productosDTOSalida.add(productoDtoSalida);
	    }
	    pedidoDTOSalida.setCarrito(productosDTOSalida);
	    return pedidoDTOSalida;
	}

}

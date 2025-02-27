package com.alejobasilio.pruba_tienda.business.mappers;

import com.alejobasilio.pruba_tienda.business.dtos.CaracteristicasDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PrecioDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOSalida;
import com.alejobasilio.pruba_tienda.integration.model.Caracteristica;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Precio;
import com.alejobasilio.pruba_tienda.integration.model.Producto;


/**
 * Interfaz que define los métodos para mapear entidades a objetos de transferencia de datos (DTOS).
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 * @since 1.0
 */
public interface PedidoMapper {

	/**
	 * Método que convierte un objeto de tipo {@link Producto} en un objeto de tipo {@link ProductoDTOSalida}
	 * 
	 */
    ProductoDTOSalida productoProductoDTOSalida(Producto producto);

    /**
     * Método que convierte un objeto de tipo {@link Caracteristica} en un objeto de tipo {@link CaracteristicasDTOSalida}.
     * 
     */
    CaracteristicasDTOSalida caracteristicaCaracteristicasDTOSalida(Caracteristica caracteristica);

    /**
     * Método que convierte un objeto de tipo {@link Precio} en un objeto de tipo {@link PrecioDTOSalida}.
     * 
     */
    PrecioDTOSalida precioPrecioDTOSalida(Precio precio);

    /**
     * Método que convierte un objeto de tipo {@link Pedido} en un objeto de tipo {@link PedidoDTOSalida}.
     *
     */
    PedidoDTOSalida pedidoPedidoDTOSalida(Pedido pedido);
}


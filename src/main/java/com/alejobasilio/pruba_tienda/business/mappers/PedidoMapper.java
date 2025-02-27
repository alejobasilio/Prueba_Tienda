package com.alejobasilio.pruba_tienda.business.mappers;

import com.alejobasilio.pruba_tienda.business.dtos.CaracteristicasDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PrecioDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOSalida;
import com.alejobasilio.pruba_tienda.integration.model.Caracteristica;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Precio;
import com.alejobasilio.pruba_tienda.integration.model.Producto;

public interface PedidoMapper {

    ProductoDTOSalida productoProductoDTOSalida(Producto producto);

    CaracteristicasDTOSalida caracteristicaCaracteristicasDTOSalida(Caracteristica caracteristica);

    PrecioDTOSalida precioPrecioDTOSalida(Precio precio);

    PedidoDTOSalida pedidoPedidoDTOSalida(Pedido pedido);
}


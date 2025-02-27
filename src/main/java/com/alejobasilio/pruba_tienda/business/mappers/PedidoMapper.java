package com.alejobasilio.pruba_tienda.business.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.alejobasilio.pruba_tienda.business.dtos.CaracteristicasDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PedidoDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.PrecioDTOSalida;
import com.alejobasilio.pruba_tienda.business.dtos.ProductoDTOSalida;
import com.alejobasilio.pruba_tienda.integration.model.Caracteristica;
import com.alejobasilio.pruba_tienda.integration.model.Pedido;
import com.alejobasilio.pruba_tienda.integration.model.Precio;
import com.alejobasilio.pruba_tienda.integration.model.Producto;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

    PedidoMapper pedidoMapper = Mappers.getMapper(PedidoMapper.class); 

    ProductoDTOSalida productoProductoDTOSalida(Producto producto);

    CaracteristicasDTOSalida caracteristicaCaracteristicasDTOSalida(Caracteristica caracteristica);

    PrecioDTOSalida precioPrecioDTOSalida(Precio precio);

    PedidoDTOSalida pedidoPedidoDTOSalida(Pedido pedido);

}

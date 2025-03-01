package com.alejobasilio.pruba_tienda.integration.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Clase que representa un pedido.
 * 
 * Un pedido es una entidad que contiene una lista de productos.
 * 
 * @author Alejo Basilio Alfonso
 * @version 1.0
 */
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PEDIDO")
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@OneToMany
	@JoinTable(name = "LISTA_PRODUCTO", joinColumns = @JoinColumn(name="ID_PRODUCTOS"))
	private List<Producto> listaProductos;
}

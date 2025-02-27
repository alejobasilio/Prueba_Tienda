package com.alejobasilio.pruba_tienda.integration.model;

import java.util.List;

import jakarta.persistence.CollectionTable;
import jakarta.persistence.Column;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ElementCollection;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "PRODUCTO")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "nombre_producto")
	private String nombre;
	private String marca;
	
	@Embedded
	private Precio precio;

	@ElementCollection
    @CollectionTable(name = "PRODUCTO_CARACTERISTICAS", joinColumns = @JoinColumn(name = "producto_id"))
    private List<Caracteristica> caracteristicas; 
	
}

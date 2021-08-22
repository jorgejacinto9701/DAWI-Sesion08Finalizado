package com.empresa.entidades;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto_has_boleta")
public class ProductoHasBoleta {

	@EmbeddedId
	private ProductoHasBoletaPK productoHasBoletaPK;

	@Column(precision = 22)
	private double precio;

	@Column(length = 10)
	private int cantidad;

	@ManyToOne(optional = false)
	@JoinColumn(name = "idboleta", nullable = false, insertable = false, updatable = false)
	private Boleta boleta;

	@ManyToOne(optional = false)
	@JoinColumn(name = "idproducto", nullable = false, insertable = false, updatable = false)
	private Producto producto;

}

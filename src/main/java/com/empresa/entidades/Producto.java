package com.empresa.entidades;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "producto")
public class Producto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idproducto", unique = true, nullable = false, length = 10)
	private int idProducto;

	@Column(length = 45)
	private String nombre;

	@Column(precision = 22)
	private double precio;

	@Column(length = 10)
	private int stock;

	@ManyToOne(optional = false)
	@JoinColumn(name = "idcategoria", nullable = false)
	private Categoria categoria;

}

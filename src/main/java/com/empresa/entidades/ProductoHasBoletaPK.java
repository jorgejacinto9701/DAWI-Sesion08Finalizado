package com.empresa.entidades;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ProductoHasBoletaPK implements Serializable {

	private static final long serialVersionUID = 1L;

	@Column(name = "idboleta", unique = true, nullable = false, length = 10, insertable = true, updatable = false)
	private int idBoleta;

	@Column(name = "idproducto", unique = true, nullable = false, length = 10, insertable = true, updatable = false)
	private int idProducto;

}

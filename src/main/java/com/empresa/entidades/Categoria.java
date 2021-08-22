package com.empresa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "categoria")
public class Categoria {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcategoria", unique = true, nullable = false, length = 11)
	private int idCategoria;

	@Column(length = 45)
	private String descripcion;

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria")
	private List<Producto> productos;

}

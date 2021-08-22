package com.empresa.entidades;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idcliente", unique = true, nullable = false, length = 10)
	private int idCliente;

	@Column(length = 45)
	private String nombre;

	@Column(length = 45)
	private String apellido;

	@JsonIgnore
	@OneToMany(mappedBy = "cliente")
	private List<Boleta> boletas;
	
	public String getApellidoNombre() {
		return apellido+" " + nombre;
	}

}

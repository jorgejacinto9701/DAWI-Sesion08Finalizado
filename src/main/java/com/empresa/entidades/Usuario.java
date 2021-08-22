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
@Table(name = "usuario")
public class Usuario {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "idusuario", unique = true, nullable = false, length = 10)
	private int idUsuario;

	@Column(length = 45)
	private String nombre;

	@Column(length = 45)
	private String login;

	@Column(length = 45)
	private String clave;

	@Column(length = 45)
	private String correo;

	@JsonIgnore
	@OneToMany(mappedBy = "usuario")
	private List<Boleta> boletas;

}

package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entidades.Boleta;

public interface BoletaRepository extends JpaRepository<Boleta, Integer>{
	
	@Query("Select x from Boleta x where x.cliente.idCliente = :param_cli")
	public abstract List<Boleta> listaBoleta(@Param("param_cli") int idCliente);
	
}

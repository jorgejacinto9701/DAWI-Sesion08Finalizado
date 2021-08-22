package com.empresa.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

	@Query("Select x from Cliente x where nombre like :var_filtro or apellido like :var_filtro")
	public abstract List<Cliente> listaCliente(@Param("var_filtro") String filtro, Pageable pageable);

	@Query("Select x from Cliente x order by x.apellido asc")
	public abstract List<Cliente> listaCliente();
}

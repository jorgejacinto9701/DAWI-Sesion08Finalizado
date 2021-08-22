package com.empresa.repository;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entidades.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Integer> {

	@Query("Select x from Producto x where x.nombre like :var_fil")
	public List<Producto> listaproducto(@Param("var_fil") String filtro, Pageable pageable);

}

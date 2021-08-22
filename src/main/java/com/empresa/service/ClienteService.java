package com.empresa.service;

import java.util.List;

import org.springframework.data.domain.Pageable;

import com.empresa.entidades.Cliente;

public interface ClienteService {

	public abstract List<Cliente> listaCliente(String filtro , Pageable pageable) ;
	public abstract List<Cliente> listaCliente() ;
	
	
}

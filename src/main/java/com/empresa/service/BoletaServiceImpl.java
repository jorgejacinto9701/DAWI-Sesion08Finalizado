package com.empresa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entidades.Boleta;
import com.empresa.entidades.ProductoHasBoleta;
import com.empresa.repository.BoletaRepository;
import com.empresa.repository.ProductoHasBoletaRepository;

@Service
public class BoletaServiceImpl implements BoletaService{

	@Autowired
	private BoletaRepository boletaRepository;
	
	@Autowired
	private ProductoHasBoletaRepository detalleRepository;
	
	
	@Override
	public List<Boleta> listaBoleta(int idCliente) {
		return boletaRepository.listaBoleta(idCliente);
	}

	@Override
	public Optional<Boleta> listaBoletaPorId(int idBoleta) {
		return boletaRepository.findById(idBoleta);
	}

	@Override
	public List<ProductoHasBoleta> listaDetalle(int idBoleta) {
		return detalleRepository.listaDetalle(idBoleta);
	}

}

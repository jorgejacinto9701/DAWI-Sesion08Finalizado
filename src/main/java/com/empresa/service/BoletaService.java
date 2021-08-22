package com.empresa.service;

import java.util.List;
import java.util.Optional;

import com.empresa.entidades.Boleta;
import com.empresa.entidades.ProductoHasBoleta;

public interface BoletaService {


	public abstract List<Boleta> listaBoleta(int idCliente);
	public abstract Optional<Boleta> listaBoletaPorId(int idBoleta);
	public abstract List<ProductoHasBoleta> listaDetalle(int idBoleta);
}

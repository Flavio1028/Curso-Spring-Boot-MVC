package com.codeup.curso.boot.dao;

import java.util.List;

import com.codeup.curso.boot.domain.Cargo;
import com.codeup.curso.boot.util.PaginacaoUtil;

public interface CargoDao {

	void save(Cargo Cargo);

	void update(Cargo Cargo);

	void delete(Long id);

	Cargo findById(Long id);

	List<Cargo> findAll();

	PaginacaoUtil<Cargo> buscaPaginada(int pagina, String direcao);

}
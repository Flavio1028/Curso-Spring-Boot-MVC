package com.codeup.curso.boot.dao;

import java.time.LocalDate;
import java.util.List;

import com.codeup.curso.boot.domain.Funcionario;

public interface FuncionarioDao {

	void save(Funcionario Funcionario);

	void update(Funcionario Funcionario);

	void delete(Long id);

	Funcionario findById(Long id);

	List<Funcionario> findAll();

	List<Funcionario> findByName(String nome);

	List<Funcionario> findByCargoId(Long id);

	List<Funcionario> findByDataEntradaDataSaida(LocalDate entrada, LocalDate saida);

	List<Funcionario> findByDataEntrada(LocalDate entrada);

	List<Funcionario> findByDataSaida(LocalDate saida);
}
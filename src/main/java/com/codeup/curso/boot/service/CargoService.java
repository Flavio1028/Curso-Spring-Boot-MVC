package com.codeup.curso.boot.service;

import java.util.List;

import com.codeup.curso.boot.domain.Cargo;
import com.codeup.curso.boot.util.PaginacaoUtil;

public interface CargoService {

	void salvar(Cargo cargo);

	void editar(Cargo cargo);

	void excluir(Long id);

	Cargo buscarPorId(Long id);

	List<Cargo> buscarTodos();

	boolean cargoTemFuncionario(Long id);

	PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao);

}
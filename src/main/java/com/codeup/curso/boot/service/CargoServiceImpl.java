package com.codeup.curso.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.codeup.curso.boot.dao.CargoDao;
import com.codeup.curso.boot.domain.Cargo;
import com.codeup.curso.boot.util.PaginacaoUtil;

@Service
@Transactional(readOnly = false)
public class CargoServiceImpl implements CargoService {

	@Autowired
	private CargoDao dao;

	@Override
	public void salvar(Cargo cargo) {
		dao.save(cargo);
	}

	@Override
	public void editar(Cargo cargo) {
		dao.update(cargo);
	}

	@Override
	public void excluir(Long id) {
		dao.delete(id);
	}

	@Override
	@Transactional(readOnly = true)
	public Cargo buscarPorId(Long id) {
		return dao.findById(id);
	}

	@Override
	@Transactional(readOnly = true)
	public List<Cargo> buscarTodos() {
		return dao.findAll();
	}

	@Override
	public boolean cargoTemFuncionario(Long id) {
		if (buscarPorId(id).getFuncionario().isEmpty()) {
			return false;
		}
		return true;
	}

	@Override
	public PaginacaoUtil<Cargo> buscarPorPagina(int pagina, String direcao) {
		return dao.buscaPaginada(pagina, direcao);
	}

}
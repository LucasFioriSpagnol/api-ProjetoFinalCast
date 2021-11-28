package br.com.cadastro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cadastro.domain.Produto;
import br.com.cadastro.repositories.ProdutoRepository;

@Service
public class DBService {
	
	@Autowired
	private ProdutoRepository repo;
	
	
	public void inicializarBancoDados() {
		Produto produto = new Produto(null, "Sapato", 3, 99.99);
		repo.save(produto);
	}

}

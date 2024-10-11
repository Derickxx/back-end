package br.itb.projeto.pizzaria3h.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3h.model.entity.Produto;
import br.itb.projeto.pizzaria3h.model.entity.Produto;
import br.itb.projeto.pizzaria3h.model.repository.ProdutoRepository;
import jakarta.transaction.Transactional;

@Service
public class ProdutoService {

	private ProdutoRepository produtoRepository;
	
	public ProdutoService(ProdutoRepository produtoRepository) {
		super();
		this.produtoRepository = produtoRepository;
	}

	// Source -> Generate Constructors using fields...
	
	public List<Produto> findAll(){
		List<Produto> produtos = 
				produtoRepository.findAll();
		
		return produtos;
	}
	
	@Transactional
	public Produto create(Produto produto) {
		
		produto.setUrlFoto(null);
		produto.setStatusProd("ATIVO");
		
		return produtoRepository.save(produto);
		
	}

	@Transactional
	public Produto inativar(long id) {
		Optional<Produto> _produto = produtoRepository.findById(id);
		
		if (_produto.isPresent()) {
			
			Produto produtoAtualizada = _produto.get();
			produtoAtualizada.setStatusProd("inativo");
			
			return produtoRepository.save(produtoAtualizada);
		}
		return null;
	}

	@Transactional
	public Produto alterar(long id, Produto produto) {
		Optional<Produto> _produto = produtoRepository.findById(id);
		
		if (_produto.isPresent()) {
			
			Produto produtoAtualizada = _produto.get();
			produtoAtualizada.setPreco(produto.getPreco());
			
			return produtoRepository.save(produtoAtualizada);
		}
		return null;
	}
}






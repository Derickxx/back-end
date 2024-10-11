package br.itb.projeto.pizzaria3h.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.itb.projeto.pizzaria3h.model.entity.Categoria;
import br.itb.projeto.pizzaria3h.model.repository.CategoriaRepository;
import jakarta.transaction.Transactional;

@Service
public class CategoriaService {

	private CategoriaRepository categoriaRepository;

	public CategoriaService(CategoriaRepository categoriaRepository) {
		super();
		this.categoriaRepository = categoriaRepository;
	}
	
	public List<Categoria> findAll(){
		List<Categoria> categorias = categoriaRepository.findAll();
		return categorias;
	}
	
	//jakarta.transaction.Transactional
	@Transactional
	public Categoria create(Categoria categoria) {
		
		return categoriaRepository.save(categoria);
	}
}









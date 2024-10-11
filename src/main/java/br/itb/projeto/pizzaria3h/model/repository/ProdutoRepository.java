package br.itb.projeto.pizzaria3h.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.itb.projeto.pizzaria3h.model.entity.Produto;

@Repository
public interface ProdutoRepository 
				extends JpaRepository<Produto, Long>{

}







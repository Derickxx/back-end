package br.itb.projeto.pizzaria3h.service;

import java.util.ArrayList;
import java.util.List;

import br.itb.projeto.pizzaria3h.model.entity.Aluno;
import br.itb.projeto.pizzaria3h.model.repository.AlunoRepository;

public class AlunoServices implements AlunoRepository {
	
	@Override
	public Aluno find() {
		Aluno aluno = new Aluno(87534, "Marck Zukerbarg", 22);
		return aluno;
	}

	@Override
	public List<Aluno> findAll() {
		// TODO Auto-generated method stub
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(123445, "Rolania", 23));
		alunos.add(new Aluno(123445, "Jakson", 24));
		alunos.add(new Aluno(123445, "Bento", 25));
		return alunos;
	}
	public  Aluno findByrm(long rm) {
		// TODO Auto-generated method stub
		List<Aluno> alunos = new ArrayList<Aluno>();
		alunos.add(new Aluno(123445, "Rolania", 23));
		alunos.add(new Aluno(123445, "Jakson", 24));
		alunos.add(new Aluno(123445, "Bento", 25));
		for(int i = 0; i < alunos.size(); i++ ) {
			if(alunos.get(i).getRm() == rm) {
				return alunos.get(i);
			}
		}
		
		return null;
				
				
				
				
	}

	@Override
	public Aluno findByRm(long rm) {
		// TODO Auto-generated method stub
		return null;
	}

	
	
	

}

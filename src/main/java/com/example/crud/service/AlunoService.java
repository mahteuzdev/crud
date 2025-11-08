package com.example.crud.service;


import com.example.crud.entity.Aluno;
import com.example.crud.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    @Autowired
    private AlunoRepository alunoRepository;

    //criar ou atualizar
    public Aluno salvar(Aluno aluno){
        return alunoRepository.save(aluno);
    }

    //Buscar todos
    public List<Aluno> listarTodos(){
        return alunoRepository.findAll();
    }

    //Buscar por ID
    public Optional<Aluno> buscarPorId(Long id){
        return alunoRepository.findById(id);
    }

    //Deletar
    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

}

package com.springboot.cadastro.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.cadastro.Model.PessoaModel;

public interface PessoaRepository extends JpaRepository<PessoaModel, Long>{
    
}

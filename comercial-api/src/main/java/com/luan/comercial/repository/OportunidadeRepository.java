package com.luan.comercial.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luan.comercial.model.Oportunidade;

public interface OportunidadeRepository extends JpaRepository<Oportunidade, Long>
{
    Optional<Oportunidade> findByDescricaoAndNomeProspecto(String descricao, String nomeProspecto);
}

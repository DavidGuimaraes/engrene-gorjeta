package com.engrene.gorjeta.repository;

import com.engrene.gorjeta.model.Permissao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface PermissaoRepository extends JpaRepository<Permissao, Long> {

    @Query(value = "SELECT pm FROM Permissao pm WHERE pm.descricao LIKE :descricao")
    Optional<Permissao> findByDescricao(String descricao);
}

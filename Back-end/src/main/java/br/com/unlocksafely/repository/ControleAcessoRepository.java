package br.com.unlocksafely.repository;

import br.com.unlocksafely.entity.ControleAcesso;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ControleAcessoRepository extends JpaRepository<ControleAcesso, Long> {
}

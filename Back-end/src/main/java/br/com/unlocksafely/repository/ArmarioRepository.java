package br.com.unlocksafely.repository;

import br.com.unlocksafely.entity.Armario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArmarioRepository extends JpaRepository<Armario, Long> {
}

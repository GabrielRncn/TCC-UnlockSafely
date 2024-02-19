package br.com.unlocksafely.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Usuario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String nome;
    @Enumerated(EnumType.STRING)
    @Column(name = "ocupacao", columnDefinition = "ENUM('FUNCIONARIO','ALUNO')")
    private Ocupacao ocupacao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario that = (Usuario) o;
        return id == that.id && Objects.equals(nome, that.nome) && ocupacao == that.ocupacao;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome, ocupacao);
    }
}

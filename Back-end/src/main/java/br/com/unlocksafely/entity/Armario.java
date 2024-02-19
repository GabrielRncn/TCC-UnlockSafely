package br.com.unlocksafely.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Objects;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Armario implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String bloco;
    private String id_tag;
    private Tipo tipo;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Armario armario = (Armario) o;
        return id == armario.id && Objects.equals(bloco, armario.bloco) && Objects.equals(id_tag, armario.id_tag) && tipo == armario.tipo;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, bloco, id_tag, tipo);
    }
}

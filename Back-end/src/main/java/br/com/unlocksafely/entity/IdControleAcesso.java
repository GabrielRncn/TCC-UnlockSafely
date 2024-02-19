package br.com.unlocksafely.entity;

import java.io.Serializable;
import java.util.Objects;

public class IdControleAcesso implements Serializable {
    private Long idUsuario;
    private Long idArmario;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        IdControleAcesso that = (IdControleAcesso) o;
        return Objects.equals(idUsuario, that.idUsuario) && Objects.equals(idArmario, that.idArmario);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, idArmario);
    }
}

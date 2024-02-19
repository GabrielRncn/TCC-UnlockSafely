package br.com.unlocksafely.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Date;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@IdClass(IdControleAcesso.class)
@Table(name="controle_acesso")
public class ControleAcesso implements Serializable {
    private static final long serialVersionUID = 1L;


    @Id
    @Column(name="id_usuario")
    private long idUsuario;

    @Id
    @Column(name="id_armario")
    private long idArmario;

    @Column(name="data_cadastro")
    private Date dataCadastro;

    @Column(name="data_encerramento")
    private Date dataEncerramento;

    private boolean status;
}
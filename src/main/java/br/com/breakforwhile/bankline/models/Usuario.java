package br.com.breakforwhile.bankline.models;

import lombok.Data;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cpf;
    private String login;
    private String nome;
    private boolean redefinirSenha;
    private String senha;
    private String senhaTemporaria;




}

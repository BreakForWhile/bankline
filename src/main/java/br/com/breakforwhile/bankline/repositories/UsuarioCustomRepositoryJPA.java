package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Usuario;

import java.util.Optional;

public interface UsuarioCustomRepositoryJPA {

    Optional<Usuario> findByLogin(String login);

    Optional<Usuario> findByCpf(String cpf);

}

package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Usuario;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface UsuarioCustomRepositoryJPA {

    Optional<Usuario> findByLogin(String login);

    Optional<Usuario> findByCpf(String cpf);

    @Transactional
    @Modifying
    @Query("UPDATE Usuario u set u.senha = :senha where u.login = :login")
    void updateSenha(@Param("senha") String senha, @Param("login") String login);

}

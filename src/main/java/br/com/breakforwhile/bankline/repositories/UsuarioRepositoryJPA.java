package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepositoryJPA extends JpaRepository<Usuario, Long>, UsuarioCustomRepositoryJPA {

}

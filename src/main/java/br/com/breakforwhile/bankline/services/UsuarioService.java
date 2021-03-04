package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.Usuario;

public interface UsuarioService {

    Usuario save(Usuario usuario);

    String redefinirSenha();

    String enviarSenhaPorEmail(String login, String email);

    void updateSenha(String senha, String login);

}

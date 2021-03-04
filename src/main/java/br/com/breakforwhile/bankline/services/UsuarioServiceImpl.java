package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.Usuario;
import br.com.breakforwhile.bankline.repositories.UsuarioCustomRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.UsuarioRepositoryJPA;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.security.SecureRandom;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

@Service
public class UsuarioServiceImpl implements UsuarioService{

    private UsuarioRepositoryJPA usuarioRepositoryJPA;
    private EmailService emailService;

    public UsuarioServiceImpl(UsuarioRepositoryJPA usuarioRepositoryJPA, EmailService emailService) {
        this.usuarioRepositoryJPA = usuarioRepositoryJPA;
        this.emailService = emailService;
    }

    @Override
    public Usuario save(Usuario usuario) {
        usuario.setSenha(new BCryptPasswordEncoder().encode(usuario.getSenha()));
        return usuarioRepositoryJPA.save(usuario);
    }

    @Override
    public String redefinirSenha() {
        return "";
    }

    @Override
    public String enviarSenhaPorEmail(String login, String email) {
        String senha = randomPassword(10);
        emailService.send(email, "Senha: " + senha);
        //updateSenha(new BCryptPasswordEncoder().encode(senha), login);
        updateSenha(senha, login);
        return senha;
    }

    @Override
    public void updateSenha(String senha, String login) {
        System.out.println(senha);
        System.out.println(login);
        usuarioRepositoryJPA.updateSenha(senha, login);
    }

    /**
     *
     * @param count
     * @return
     */
    private String randomPassword(int count){
        Random random = new SecureRandom();
        IntStream specialChars = random.ints(count, 48, 123);
        Object[] objects = specialChars.mapToObj(data -> ((char) data)).toArray();

        String password = "";
        for (Object ob : objects ) {
            password += ((char) ob);
        }
        return password;
    }

}

package br.com.breakforwhile.bankline.config.security;

import br.com.breakforwhile.bankline.models.Usuario;
import br.com.breakforwhile.bankline.repositories.UsuarioRepositoryJPA;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AutenticacaoService implements UserDetailsService {

    private UsuarioRepositoryJPA usuarioRepositoryJPA;

    public AutenticacaoService(UsuarioRepositoryJPA usuarioRepositoryJPA) {
        this.usuarioRepositoryJPA = usuarioRepositoryJPA;
    }

    @Override
    public UserDetails loadUserByUsername(String login) throws UsernameNotFoundException {
        Optional<Usuario> usuarioOptional = usuarioRepositoryJPA.findByLogin(login);
        if(!usuarioOptional.isEmpty()){
            return usuarioOptional.get();
        }
        usuarioOptional = usuarioRepositoryJPA.findByCpf(login);
        if(!usuarioOptional.isEmpty()){
            return usuarioOptional.get();
        }
        throw new UsernameNotFoundException("Dados inválidos!");

    }
}

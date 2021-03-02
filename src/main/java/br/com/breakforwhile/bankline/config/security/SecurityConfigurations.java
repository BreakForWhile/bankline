package br.com.breakforwhile.bankline.config.security;

import br.com.breakforwhile.bankline.repositories.UsuarioRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {

    private final AutenticacaoService autenticacaoService;
    private TokenService tokenService;
    private UsuarioRepositoryJPA usuarioRepositoryJPA;

    public SecurityConfigurations(AutenticacaoService autenticacaoService, TokenService tokenService, UsuarioRepositoryJPA usuarioRepositoryJPA) {
        this.autenticacaoService = autenticacaoService;
        this.tokenService = tokenService;
        this.usuarioRepositoryJPA = usuarioRepositoryJPA;
    }

    // autenticação
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(autenticacaoService).passwordEncoder(new BCryptPasswordEncoder());
    }

    //Autorização
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/**").permitAll()
                .antMatchers(HttpMethod.POST, "/lancamentos/*").permitAll()/*
                .antMatchers("/h2-console/*").permitAll()
                .antMatchers(HttpMethod.GET, "/lancamentos/*").permitAll()
                .antMatchers(HttpMethod.POST, "/auth").permitAll()
                .anyRequest().authenticated()*/

                .and().csrf().disable()
                .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS)
                .and().addFilterBefore(new AutenticacaoViaTokenFilter(tokenService, usuarioRepositoryJPA), UsernamePasswordAuthenticationFilter.class);
    }

    //Arquivos estáticos
    @Override
    public void configure(WebSecurity web) throws Exception {

    }

    @Bean
    @Override
    protected AuthenticationManager authenticationManager() throws Exception {
        return super.authenticationManager();
    }
}

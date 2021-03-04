package br.com.breakforwhile.bankline.restcontrollers;

import br.com.breakforwhile.bankline.config.security.TokenService;
import br.com.breakforwhile.bankline.models.DTO.TokenDTO;
import br.com.breakforwhile.bankline.models.form.LoginForm;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@RequestMapping("/auth")
public class AutenticacaoRestController {

    private AuthenticationManager authenticationManager;
    private TokenService tokenService;

    public AutenticacaoRestController(AuthenticationManager authenticationManager, TokenService tokenService) {
        this.authenticationManager = authenticationManager;
        this.tokenService = tokenService;
    }

    @PostMapping
    public ResponseEntity<TokenDTO> autenticar(@RequestBody @Valid LoginForm form){
        UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = form.converter();
        try{
            Authentication authenticate = authenticationManager.authenticate(usernamePasswordAuthenticationToken);
            String token = tokenService.gerarToken(authenticate);
            return ResponseEntity.ok(new TokenDTO(token, "Bearer"));
        }
        catch(AuthenticationException e){
            return ResponseEntity.badRequest().build();
        }

    }
}

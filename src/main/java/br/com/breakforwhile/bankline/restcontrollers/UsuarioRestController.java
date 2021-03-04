package br.com.breakforwhile.bankline.restcontrollers;

import br.com.breakforwhile.bankline.models.DTO.NovaSenhaDTO;
import br.com.breakforwhile.bankline.models.DTO.UsuarioDTO;
import br.com.breakforwhile.bankline.models.Usuario;
import br.com.breakforwhile.bankline.services.ContaService;
import br.com.breakforwhile.bankline.services.UsuarioService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/usuario")
public class UsuarioRestController {

    private UsuarioService usuarioService;
    private ContaService contaService;

    public UsuarioRestController(UsuarioService usuarioService, ContaService contaService) {
        this.usuarioService = usuarioService;
        this.contaService = contaService;
    }

    @PostMapping
    public ResponseEntity<UsuarioDTO> save(@RequestBody UsuarioDTO usuarioDTO){
        Usuario newUsuario = usuarioService.save(usuarioDTO.toUsuario());
        contaService.criarContas(newUsuario);
        return new ResponseEntity<>(new UsuarioDTO(newUsuario), HttpStatus.CREATED);
    }

    @PostMapping("/senha-por-email")
    public String enviarSenhaPorEmail(@RequestBody NovaSenhaDTO novaSenhaDTO){
        return usuarioService.enviarSenhaPorEmail(novaSenhaDTO.getLogin(), novaSenhaDTO.getEmail());
    }

}

package br.com.breakforwhile.bankline.restcontrollers;

import br.com.breakforwhile.bankline.models.DTO.PlanoContaDTO;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.services.LancamentoService;
import br.com.breakforwhile.bankline.services.PlanoContaService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lancamentos")
public class LancamentoRestController {

    private LancamentoService lancamentoService;
    private PlanoContaService planoContaService;

    public LancamentoRestController(LancamentoService lancamentoService, PlanoContaService planoContaService) {
        this.lancamentoService = lancamentoService;
        this.planoContaService = planoContaService;
    }

    @GetMapping("/planos-conta")
    public ResponseEntity<List<PlanoConta>> findAllPlanoDeContasByLogin(@RequestParam String login){
        return new ResponseEntity<>(planoContaService.findAllByLogin(login), HttpStatus.OK);
    }

    @PostMapping("/planos-conta")
    public ResponseEntity<PlanoConta> salvePlanoConta(@RequestBody PlanoContaDTO planoConta){

        return new ResponseEntity<>(null, HttpStatus.CREATED);
    }
}

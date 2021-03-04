package br.com.breakforwhile.bankline.restcontrollers;

import br.com.breakforwhile.bankline.models.DTO.LancamentoDTO;

import br.com.breakforwhile.bankline.models.Lancamento;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.models.PlanoContaDespesa;
import br.com.breakforwhile.bankline.models.PlanoContaReceita;
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

    @GetMapping("/{idConta}")
    public ResponseEntity<List<Lancamento>> findAllLancamentosByIdConta(@PathVariable Long idConta){
        return new ResponseEntity<List<Lancamento>>(lancamentoService.findAllByIdConta(idConta), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Lancamento> saveLancamento(@RequestBody LancamentoDTO lancamentoDTO){
        Lancamento lancamento = lancamentoService.save(lancamentoDTO);
        return new ResponseEntity<>(lancamento, HttpStatus.CREATED);
    }

    @GetMapping("/planos-conta")
    public ResponseEntity<List<PlanoConta>> findAllPlanoDeContasByLogin(@RequestParam String login){
        return new ResponseEntity<>(planoContaService.findAllByLogin(login), HttpStatus.OK);
    }

    @PostMapping("/planos-conta-despesa")
    public ResponseEntity<PlanoConta> savePlanoContaDespesa(@RequestBody PlanoContaDespesa planoContaDespesa){
        return new ResponseEntity<>(planoContaService.save(planoContaDespesa), HttpStatus.CREATED);
    }

    @PostMapping("/planos-conta-receita")
    public ResponseEntity<PlanoConta> salvePlanoContaReceita(@RequestBody PlanoContaReceita planoContaReceita){
        return new ResponseEntity<>(planoContaService.save(planoContaReceita), HttpStatus.CREATED);
    }

}

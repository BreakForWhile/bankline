package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.DTO.LancamentoDTO;
import br.com.breakforwhile.bankline.models.Lancamento;
import br.com.breakforwhile.bankline.models.PlanoConta;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface LancamentoService {

    public List<PlanoConta> findAllPlanoDeContasByLogin(String login);

    Lancamento save(LancamentoDTO lancamentoDTO);

    List<Lancamento> findAllByIdConta(Long idConta);
}

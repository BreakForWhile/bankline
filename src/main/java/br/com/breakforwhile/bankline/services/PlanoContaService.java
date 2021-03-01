package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.PlanoConta;

import java.util.List;

public interface PlanoContaService {

    List<PlanoConta> findAllByLogin(String login);

    PlanoConta save(PlanoConta planoConta);
}

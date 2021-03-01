package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.PlanoConta;

import java.util.List;

public interface PlanoContaCustomRepositoryJPA {

    List<PlanoConta> findAllByLogin(String login);

}

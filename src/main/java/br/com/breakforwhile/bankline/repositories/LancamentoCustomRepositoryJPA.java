package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.Lancamento;

import java.time.LocalDate;
import java.util.List;

public interface LancamentoCustomRepositoryJPA {

    List<Lancamento> findAllByContaAndDataBetween(Conta conta, LocalDate inicio, LocalDate fim);
}

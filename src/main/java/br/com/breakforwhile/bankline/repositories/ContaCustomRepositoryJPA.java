package br.com.breakforwhile.bankline.repositories;

import br.com.breakforwhile.bankline.models.Conta;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface ContaCustomRepositoryJPA {

    List<Conta> findAllByNumero(String numero);

}

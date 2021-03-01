package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.repositories.LancamentoRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.PlanoContaRepositoryJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoServiceImpl implements LancamentoService{

    private PlanoContaRepositoryJPA planoContaRepositoryJPA;

    public LancamentoServiceImpl(PlanoContaRepositoryJPA planoContaRepositoryJPA) {
        this.planoContaRepositoryJPA = planoContaRepositoryJPA;
    }

    @Override
    public List<PlanoConta> findAllPlanoDeContasByLogin(String login) {
        return planoContaRepositoryJPA.findAllByLogin(login);
    }
}

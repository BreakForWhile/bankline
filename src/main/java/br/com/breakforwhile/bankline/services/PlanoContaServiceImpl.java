package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.repositories.PlanoContaRepositoryJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlanoContaServiceImpl implements PlanoContaService{

    private PlanoContaRepositoryJPA planoContaRepositoryJPA;

    public PlanoContaServiceImpl(PlanoContaRepositoryJPA planoContaRepositoryJPA) {
        this.planoContaRepositoryJPA = planoContaRepositoryJPA;
    }

    @Override
    public List<PlanoConta> findAllByLogin(String login) {
        return planoContaRepositoryJPA.findAllByLogin(login);
    }

    @Override
    public PlanoConta save(PlanoConta planoConta) {
        return planoContaRepositoryJPA.save(planoConta);
    }
}

package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.DTO.LancamentoDTO;
import br.com.breakforwhile.bankline.models.Lancamento;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.repositories.ContaRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.LancamentoRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.PlanoContaRepositoryJPA;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LancamentoServiceImpl implements LancamentoService{

    private LancamentoRepositoryJPA lancamentoRepositoryJPA;
    private PlanoContaRepositoryJPA planoContaRepositoryJPA;
    private ContaRepositoryJPA contaRepositoryJPA;

    public LancamentoServiceImpl(LancamentoRepositoryJPA lancamentoRepositoryJPA,
                                 PlanoContaRepositoryJPA planoContaRepositoryJPA, ContaRepositoryJPA contaRepositoryJPA) {
        this.lancamentoRepositoryJPA = lancamentoRepositoryJPA;
        this.planoContaRepositoryJPA = planoContaRepositoryJPA;
        this.contaRepositoryJPA = contaRepositoryJPA;
    }

    @Override
    public List<PlanoConta> findAllPlanoDeContasByLogin(String login) {
        return planoContaRepositoryJPA.findAllByLogin(login);
    }

    @Override
    public Lancamento save(LancamentoDTO lancamentoDTO) {
        PlanoConta planoConta = planoContaRepositoryJPA.findById(lancamentoDTO.getPlanoConta()).get();
        Conta conta           = contaRepositoryJPA.findById(lancamentoDTO.getConta()).get();
        Lancamento lancamento = lancamentoDTO.toLancamento();
        lancamento.setPlanoConta(planoConta);
        lancamento.setConta(conta);
        return lancamentoRepositoryJPA.save(lancamento);
    }

    @Override
    public List<Lancamento> findAllByIdConta(Long idConta) {
        return lancamentoRepositoryJPA.findAllByIdConta(idConta);
    }
}

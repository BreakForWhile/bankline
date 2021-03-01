package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.*;
import br.com.breakforwhile.bankline.models.DTO.ContaDTO;
import br.com.breakforwhile.bankline.models.DTO.DashBoardDTO;
import br.com.breakforwhile.bankline.repositories.ContaRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.LancamentoRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class DashBoardServiceImpl implements DashBoardService{

    private ContaRepositoryJPA contaRepositoryJPA;
    private LancamentoRepositoryJPA lancamentoRepositoryJPA;

    public DashBoardServiceImpl(ContaRepositoryJPA contaRepositoryJPA, LancamentoRepositoryJPA lancamentoRepositoryJPA) {
        this.contaRepositoryJPA      = contaRepositoryJPA;
        this.lancamentoRepositoryJPA = lancamentoRepositoryJPA;
    }

    @Override
    public DashBoardDTO findDashBoardByNumeroDaContaAndDataBetween(String numero, LocalDate inicio, LocalDate fim) {
        DashBoardDTO dashBoardDTO = new DashBoardDTO();
        List<Conta> contas = contaRepositoryJPA.findAllByNumero(numero);

        PlanoConta p = null;
        for (Conta c : contas) {
            double saldo = 0;
            List<Lancamento> lancamentos = lancamentoRepositoryJPA
                    .findAllByContaAndDataBetween(c, inicio, fim);

            for (Lancamento lancamento : lancamentos) {
                PlanoConta planoConta = lancamento.getPlanoConta();
                saldo = planoConta.operacao(saldo, lancamento.getValor());
                lancamento.setPlanoConta(planoConta);
                System.out.println(planoConta.getClass());
                p = planoConta;
            }
            ContaDTO contaDTO = new ContaDTO(c.getId(), lancamentos, saldo);

            if( c instanceof ContaCredito ){
                dashBoardDTO.setContaCredito(contaDTO);
            }
            else{
                dashBoardDTO.setContaDebito(contaDTO);
            }

        }


        //System.out.println(dashBoardDTO);
        //System.exit(1);
        return dashBoardDTO;
    }
}


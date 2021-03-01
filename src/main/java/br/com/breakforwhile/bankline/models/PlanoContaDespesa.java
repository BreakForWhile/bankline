package br.com.breakforwhile.bankline.models;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class PlanoContaDespesa extends PlanoConta{


    @Override
    public double operacao(double valorAcumulado, double valorAtual) {
        return valorAcumulado -= valorAtual;
    }
}

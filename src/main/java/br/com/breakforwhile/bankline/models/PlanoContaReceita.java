package br.com.breakforwhile.bankline.models;

import com.fasterxml.jackson.annotation.JsonRootName;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class PlanoContaReceita extends PlanoConta{

    @Override
    public double operacao(double valorAcumulado, double valorAtual) {
        return valorAcumulado += valorAtual;
    }
}
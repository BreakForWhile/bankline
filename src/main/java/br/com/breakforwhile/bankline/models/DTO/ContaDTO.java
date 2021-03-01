package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.Lancamento;

import java.util.List;

public class ContaDTO {

    private Long id;
    private List<Lancamento> lancamentos;
    private double saldo;

    public ContaDTO() {

    }

    public ContaDTO(Long id, List<Lancamento> lancamentos, double saldo) {
        this.id = id;
        this.lancamentos = lancamentos;
        this.saldo = saldo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Lancamento> getLancamentos() {
        return lancamentos;
    }

    public void setLancamentos(List<Lancamento> lancamentos) {
        this.lancamentos = lancamentos;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

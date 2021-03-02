package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.Lancamento;

import java.time.LocalDate;

public class LancamentoDTO {

    private Long conta;
    private String contaDestino;
    private LocalDate data;
    private String descricao;
    private String login;
    private Long planoConta;
    private double valor;


    public Long getConta() {
        return conta;
    }

    public void setConta(Long conta) {
        this.conta = conta;
    }

    public String getContaDestino() {
        return contaDestino;
    }

    public void setContaDestino(String contaDestino) {
        this.contaDestino = contaDestino;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Long getPlanoConta() {
        return planoConta;
    }

    public void setPlanoConta(Long planoConta) {
        this.planoConta = planoConta;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Lancamento toLancamento(LancamentoDTO lancamentoDTO){
        Lancamento lancamento = new Lancamento();
        lancamento.setPlanoConta(null);
        lancamento.setConta(null);
        lancamento.setData(lancamentoDTO.getData());
        lancamento.setDescricao(lancamentoDTO.getDescricao());
        //lancamento.setTipo(lancamentoDTO.get);
        return lancamento;
    }
}

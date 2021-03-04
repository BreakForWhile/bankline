package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.Lancamento;
import br.com.breakforwhile.bankline.models.enums.TipoMovimento;

import java.time.LocalDate;

public class LancamentoDTO {

    private Long conta;
    private String contaDestino;
    private LocalDate data;
    private String descricao;
    private String login;
    private Long planoConta;
    private double valor;
    private TipoMovimento tipo;


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

    public TipoMovimento getTipo() {
        return tipo;
    }

    public void setTipo(TipoMovimento tipo) {
        this.tipo = tipo;
    }

    public Lancamento toLancamento(){
        Lancamento lancamento = new Lancamento();
        lancamento.setData(this.getData());
        lancamento.setDescricao(this.getDescricao());
        lancamento.setTipo(this.getTipo());
        lancamento.setValor(this.getValor());
        return lancamento;
    }
}

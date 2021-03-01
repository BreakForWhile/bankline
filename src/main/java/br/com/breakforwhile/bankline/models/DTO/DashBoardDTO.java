package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.Conta;

public class DashBoardDTO {

    private ContaDTO contaDebito;
    private ContaDTO contaCredito;

    public DashBoardDTO() {
    }

    public DashBoardDTO(ContaDTO contaDebito, ContaDTO contaCredito) {
        this.contaDebito  = contaDebito;
        this.contaCredito = contaCredito;
    }

    public ContaDTO getContaDebito() {
        return contaDebito;
    }

    public void setContaDebito(ContaDTO contaDebito) {
        this.contaDebito = contaDebito;
    }

    public ContaDTO getContaCredito() {
        return contaCredito;
    }

    public void setContaCredito(ContaDTO contaCredito) {
        this.contaCredito = contaCredito;
    }
}

package br.com.breakforwhile.bankline.models.DTO;

import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.models.enums.TipoMovimento;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class PlanoContaDTO {

    private String descricao;
    private String login;
    private boolean padrao;
    private String tipoMovimento;

    public PlanoContaDTO(String descricao, String login, boolean padrao, String tipoMovimento) {
        this.descricao = descricao;
        this.login = login;
        this.padrao = padrao;
        this.tipoMovimento = tipoMovimento;
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

    public boolean isPadrao() {
        return padrao;
    }

    public void setPadrao(boolean padrao) {
        this.padrao = padrao;
    }

    public String getTipoMovimento() {
        return tipoMovimento;
    }

    public void setTipoMovimento(String tipoMovimento) {
        this.tipoMovimento = tipoMovimento;
    }

    public PlanoConta toPlanoConta(PlanoContaDTO planoContaDTO){
        System.out.println(planoContaDTO);
        return null;
    }
}

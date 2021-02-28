package br.com.breakforwhile.bankline.models;

import br.com.breakforwhile.bankline.models.enums.TipoMovimento;
import lombok.Data;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class PlanoConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String login;
    private boolean padrao;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlanoConta that = (PlanoConta) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "PlanoConta{" +
                "id=" + id +
                ", descricao='" + descricao + '\'' +
                ", login='" + login + '\'' +
                ", padrao=" + padrao +
                '}';
    }
}

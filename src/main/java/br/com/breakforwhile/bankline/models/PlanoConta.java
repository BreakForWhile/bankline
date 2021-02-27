package br.com.breakforwhile.bankline.models;

import br.com.breakforwhile.bankline.models.enums.TipoMovimento;
import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class PlanoConta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String descricao;
    private String login;
    private boolean padrao;

    @Enumerated(EnumType.STRING)
    private TipoMovimento tipoMovimento;

}

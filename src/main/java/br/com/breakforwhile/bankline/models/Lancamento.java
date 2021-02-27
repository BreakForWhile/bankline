package br.com.breakforwhile.bankline.models;

import br.com.breakforwhile.bankline.models.enums.TipoMovimento;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Data
public class Lancamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String descricao;

    @Enumerated(EnumType.STRING)
    private TipoMovimento tipoMovimento;
    private double valor;

    @ManyToOne
    private Conta conta;

    @OneToOne
    private PlanoConta planoConta;



}

package br.com.breakforwhile.bankline.models;

import br.com.breakforwhile.bankline.models.enums.TipoConta;
import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class Conta {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private LocalDate data;
    private String descricao;
    private String numero;

    @Enumerated(EnumType.STRING)
    private TipoConta tipo;

    @ManyToOne
    private Usuario usuario;

    @OneToMany(mappedBy = "conta")
    private List<Lancamento> lancamentos = new ArrayList<>();
}

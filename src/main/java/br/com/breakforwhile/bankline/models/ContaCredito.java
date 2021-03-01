package br.com.breakforwhile.bankline.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("1")
public class ContaCredito extends Conta{

}
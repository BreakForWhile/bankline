package br.com.breakforwhile.bankline.models;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("2")
public class ContaDebito extends Conta{

}
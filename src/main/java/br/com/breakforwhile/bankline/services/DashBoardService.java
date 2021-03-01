package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.DTO.DashBoardDTO;
import br.com.breakforwhile.bankline.models.PlanoConta;

import java.time.LocalDate;

public interface DashBoardService {

    DashBoardDTO findDashBoardByNumeroDaContaAndDataBetween(String numero, LocalDate inicio, LocalDate fim);
}

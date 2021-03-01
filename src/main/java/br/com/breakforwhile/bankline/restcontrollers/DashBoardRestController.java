package br.com.breakforwhile.bankline.restcontrollers;

import br.com.breakforwhile.bankline.models.DTO.DashBoardDTO;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.models.PlanoContaDespesa;
import br.com.breakforwhile.bankline.services.DashBoardService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

@RestController
@RequestMapping("/dashboard")
public class DashBoardRestController {

    private DashBoardService dashBoardService;

    public DashBoardRestController(DashBoardService dashBoardService) {
        this.dashBoardService = dashBoardService;
    }

    @GetMapping
    public DashBoardDTO dashboard(@RequestParam String numero,
                                @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate inicio,
                                @RequestParam @DateTimeFormat(pattern = "dd/MM/yyyy") LocalDate fim){
        return dashBoardService.findDashBoardByNumeroDaContaAndDataBetween(numero, inicio, fim);
    }
}

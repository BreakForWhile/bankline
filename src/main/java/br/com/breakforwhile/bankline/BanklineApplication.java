package br.com.breakforwhile.bankline;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.ContaCredito;
import br.com.breakforwhile.bankline.models.Lancamento;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.repositories.ContaRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.LancamentoRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.PlanoContaRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication

public class BanklineApplication implements CommandLineRunner {

	@Autowired
	private ContaRepositoryJPA contaRepositoryJPA;

	@Autowired
	private PlanoContaRepositoryJPA planoContaRepositoryJPA;

	@Autowired
	private LancamentoRepositoryJPA lancamentoRepositoryJPA;

	public static void main(String[] args) {
		SpringApplication.run(BanklineApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		LocalDate inicio = LocalDate.of(2001, 1, 1);
		LocalDate fim    = LocalDate.of(2001, 1, 15);

		List<Conta> contas = contaRepositoryJPA.findAllByNumero("teste1");

		contas.forEach( conta -> {
			List<Lancamento> lancamentos = lancamentoRepositoryJPA.findAllByContaAndDataBetween(conta, inicio, fim);
			for (Lancamento l : lancamentos ) {
				System.out.println(l);
			}
			//conta.setLancamentos(lancamentos);

			//System.out.println(c.getLancamentos());

		});

		//List<Conta> contas = contaRepositoryJPA.findAll();
		/*List<Conta> contas = contaRepositoryJPA.findAllByNumero("teste1");
		contas.forEach( c -> {
			System.out.println(c);
			System.out.println(c.getLancamentos());

		});*/

		/*List<PlanoConta> planos = planoContaRepositoryJPA.findAll();

		contas.forEach( c -> {
			System.out.println(c);
			System.out.println(c.getLancamentos());
		} );*/

		//planos.forEach( p -> System.out.println(p) );




	}
}

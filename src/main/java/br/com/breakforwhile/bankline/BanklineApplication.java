package br.com.breakforwhile.bankline;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.ContaCredito;
import br.com.breakforwhile.bankline.models.PlanoConta;
import br.com.breakforwhile.bankline.repositories.ContaRepositoryJPA;
import br.com.breakforwhile.bankline.repositories.PlanoContaRepositoryJPA;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.function.Consumer;

@SpringBootApplication

public class BanklineApplication implements CommandLineRunner {

	@Autowired
	private ContaRepositoryJPA contaRepositoryJPA;

	@Autowired
	private PlanoContaRepositoryJPA planoContaRepositoryJPA;

	public static void main(String[] args) {
		SpringApplication.run(BanklineApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {

		//List<Conta> contas = contaRepositoryJPA.findAll();
		List<Conta> contas = contaRepositoryJPA.findByNumero("teste1");
		contas.forEach( c -> {
			System.out.println(c);
			System.out.println(c.getLancamentos());

		});

		/*List<PlanoConta> planos = planoContaRepositoryJPA.findAll();

		contas.forEach( c -> {
			System.out.println(c);
			System.out.println(c.getLancamentos());
		} );*/

		//planos.forEach( p -> System.out.println(p) );




	}
}

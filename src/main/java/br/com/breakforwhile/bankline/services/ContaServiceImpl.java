package br.com.breakforwhile.bankline.services;

import br.com.breakforwhile.bankline.models.Conta;
import br.com.breakforwhile.bankline.models.ContaCredito;
import br.com.breakforwhile.bankline.models.ContaDebito;
import br.com.breakforwhile.bankline.models.Usuario;
import br.com.breakforwhile.bankline.repositories.ContaRepositoryJPA;
import org.springframework.stereotype.Service;

import java.time.LocalDate;

@Service
public class ContaServiceImpl implements ContaService {

    private ContaRepositoryJPA contaRepositoryJPA;

    public ContaServiceImpl(ContaRepositoryJPA contaRepositoryJPA) {
        this.contaRepositoryJPA = contaRepositoryJPA;
    }

    @Override
    public void criarContas(Usuario newUsuario) {
        Conta c1 = toConta(newUsuario, "Conta de Crédito");
        Conta c2 = toConta(newUsuario, "Conta de Débito");

    }

    /**
     *
     * @param usuario
     * @param descricao
     * @return
     */
    private Conta toConta(Usuario usuario, String descricao){
        Conta c = new ContaDebito();
        c.setNumero(usuario.getLogin());
        c.setDescricao(descricao);
        c.setUsuario(usuario);
        c.setData(LocalDate.now());
        return c;
    }

}
/**
 *
 * INSERT INTO CONTA(TIPO_CONTA, ID, DATA, DESCRICAO, NUMERO, USUARIO_ID )VALUES('1', 1, DATE '2001-01-01', 'CONTA DE TESTE1', 'teste1', 1);
 * INSERT INTO CONTA(TIPO_CONTA, ID, DATA, DESCRICAO, NUMERO, USUARIO_ID )VALUES('2', 2, DATE '2001-01-01', 'CONTA DE TESTE2', 'teste1', 1);
 */
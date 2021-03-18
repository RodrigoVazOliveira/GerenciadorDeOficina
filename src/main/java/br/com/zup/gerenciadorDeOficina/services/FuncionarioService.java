package br.com.zup.gerenciadorDeOficina.services;

/**
 * Criar uma classe para validar o cadastro do funcionário.
 */

import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public Funcionario cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        return funcionario;

    }

    public Funcionario pesquisarPorCpf(String cpf) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }
    }

}
package br.com.zup.gerenciadorDeOficina.services;

/**
 * Criar uma classe para validar o cadastro do funcionário.
 */

import br.com.zup.gerenciadorDeOficina.exceptions.FuncionarioExistenteException;
import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();

    public List<Funcionario> listarTodosFuncionario(){
        return funcionarios;
    }

    public Funcionario cadastrarFuncionario(Funcionario funcionario){
        validarCPF(funcionario);
        funcionarios.add(funcionario);
        return funcionario;

    }

    public Funcionario pesquisarPorCpf(String cpf) throws RuntimeException {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getCpf().equals(cpf)) {
                return funcionario;
            }
        }throw new RuntimeException("CPF não encontrado");
    }

    public void validarCPF(Funcionario funcionario) {
        for (Funcionario funcionarioCPF : funcionarios){
            if (funcionarioCPF.getCpf().equals(funcionario.getCpf())){
                throw new FuncionarioExistenteException("O cpf já esta cadastrado!");
            }
        }
    }

}
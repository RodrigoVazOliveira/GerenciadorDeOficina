package br.com.zup.gerenciadorDeOficina.service;

import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class funcionarioService {

    private static List<Funcionario> funcionarios =new ArrayList<>();

    public Funcionario cadastrarFuncionario(Funcionario funcionario){
        funcionarios.add(funcionario);
        return funcionario;

    }


}

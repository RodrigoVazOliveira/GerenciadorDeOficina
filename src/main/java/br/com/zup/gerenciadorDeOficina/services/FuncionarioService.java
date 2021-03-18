package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class FuncionarioService {

    private List<Funcionario> funcionarios = new ArrayList<>();
}

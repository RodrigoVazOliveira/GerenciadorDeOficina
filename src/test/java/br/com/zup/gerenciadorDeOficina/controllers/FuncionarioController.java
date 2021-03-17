package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import br.com.zup.gerenciadorDeOficina.services.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("funcionario/")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Funcionario cadastroFuncionario(@RequestBody Funcionario funcionario){
        Funcionario objFunc = cadastroFuncionario(funcionario);
        return objFunc;
    }

}
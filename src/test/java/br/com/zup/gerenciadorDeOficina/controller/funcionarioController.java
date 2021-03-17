package br.com.zup.gerenciadorDeOficina.controller;

import br.com.zup.gerenciadorDeOficina.model.Funcionario;
import br.com.zup.gerenciadorDeOficina.service.FuncionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("funcionario/")
public class funcionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @PostMapping

}

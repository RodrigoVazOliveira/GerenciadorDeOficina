package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/servicos/")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;
}

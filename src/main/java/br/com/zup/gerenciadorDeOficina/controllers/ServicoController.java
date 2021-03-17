package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.models.Servico;
import br.com.zup.gerenciadorDeOficina.services.ServicoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicos/")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Servico cadastrarServico(@RequestBody Servico servico) {
        return servicoService.cadatrar(servico);
    }
}

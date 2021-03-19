package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.models.Cliente;
import br.com.zup.gerenciadorDeOficina.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;


@RestController
@RequestMapping("/clientes/")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Cliente cadastrarCliente(@RequestBody @Valid Cliente cliente){
    clienteService.cadastrarCliente(cliente);
    return cliente;
    }

    @GetMapping("{cpf}/")
    @ResponseStatus(HttpStatus.OK)
    public Cliente pesquisarPeloCpfOuCnpj(@PathVariable String cpf){
        return  clienteService.pesquisarPeloCpf(cpf);
    }

    @DeleteMapping("/cliente/{cpf}/")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteClientePeloCPF(@PathVariable String cpf){
        try {
            clienteService.deletarClientePeloCPF(cpf);
        }catch (RuntimeException ex) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, ex.getMessage());
        }
    }

}
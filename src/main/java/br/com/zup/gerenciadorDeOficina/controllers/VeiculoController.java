package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.dtos.CadastrarVeiculoDTO;
import br.com.zup.gerenciadorDeOficina.models.Cliente;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import br.com.zup.gerenciadorDeOficina.services.ClienteService;
import br.com.zup.gerenciadorDeOficina.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/veiculos/")
public class VeiculoController {

    @Autowired
    private VeiculoService veiculoService;

    @Autowired
    private ClienteService clienteService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Veiculo cadastrar(@RequestBody CadastrarVeiculoDTO cadastrarVeiculoDTO) {
        Cliente cliente = clienteService.pesquisarPeloCpfOuCnpj(cadastrarVeiculoDTO.getCpfOuCnpj());
        return veiculoService.cadastrar(cadastrarVeiculoDTO.converterCadastrarVeiculoDTOparaVeiculo(cliente));
    }

}

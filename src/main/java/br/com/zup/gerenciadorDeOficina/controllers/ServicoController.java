package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.dtos.CadastrarVeiculoDTO;
import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import br.com.zup.gerenciadorDeOficina.models.Servico;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import br.com.zup.gerenciadorDeOficina.services.FuncionarioService;
import br.com.zup.gerenciadorDeOficina.services.ServicoService;
import br.com.zup.gerenciadorDeOficina.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/servicos/")
public class ServicoController {

    @Autowired
    private ServicoService servicoService;

    @Autowired
    private FuncionarioService funcionarioService;

    @Autowired
    private VeiculoService veiculoService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Servico cadastrarServico(@RequestBody CadastrarVeiculoDTO cadastrarVeiculoDTO) {
        Veiculo veiculo = veiculoService.pesquisarChassi(cadastrarVeiculoDTO.getChassi());
        Funcionario funcionario =

        return servicoService.cadatrar(cadastrarVeiculoDTO.converterCadastrarVeiculoDTOparaVeiculo(veiculo, funcionario));
    }
}

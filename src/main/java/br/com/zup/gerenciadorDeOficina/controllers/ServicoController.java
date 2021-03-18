package br.com.zup.gerenciadorDeOficina.controllers;

import br.com.zup.gerenciadorDeOficina.dtos.CadastrarServicoDTO;
import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import br.com.zup.gerenciadorDeOficina.models.Servico;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import br.com.zup.gerenciadorDeOficina.services.FuncionarioService;
import br.com.zup.gerenciadorDeOficina.services.ServicoService;
import br.com.zup.gerenciadorDeOficina.services.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import javax.validation.Valid;

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
    public Servico cadastrarServico(@RequestBody  @Valid CadastrarServicoDTO cadastrarServicoDTO) {
        try {
            Veiculo veiculo = veiculoService.pesquisarChassi(cadastrarServicoDTO.getChassi());
            Funcionario funcionario = funcionarioService.pesquisarPorCpf(cadastrarServicoDTO.getCpfFuncionario());
            return servicoService.cadatrar(cadastrarServicoDTO.converterCadastrarServicoDTOParaServico(veiculo, funcionario));
        } catch (RuntimeException e) {
            throw new ResponseStatusException(HttpStatus.BAD_REQUEST, e.getMessage());
        }
    }

}
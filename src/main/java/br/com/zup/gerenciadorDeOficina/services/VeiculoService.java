package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.exceptions.ListaVeiculoVazia;
import br.com.zup.gerenciadorDeOficina.exceptions.VeiculoDuplicadoExcecao;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    private List<Veiculo> veiculos = new ArrayList<>();

    public Veiculo cadastrar(Veiculo veiculo) {
        if (veiculos.contains(veiculo)) {
            throw new VeiculoDuplicadoExcecao("o veículo com chassi " + veiculo.getChassi() + " já existe no sistema!");
        }
        veiculos.add(veiculo);
        return veiculo;
    }

    public Veiculo pesquisarChassi(String chassi) throws RuntimeException {
        Veiculo resultadoVeiculo = null;
        for (Veiculo veiculo : veiculos) {
            if (veiculo.getChassi().equals(chassi)) {
                resultadoVeiculo = veiculo;
            }
        }

        if (resultadoVeiculo == null) {
            throw new RuntimeException("Chassi não encontrado");
        }

        return resultadoVeiculo;
    }

    public List<Veiculo> listarTodosVeiculos() {
        if (veiculos.size() == 0) {
            throw new ListaVeiculoVazia("Não existe nenhum veículo cadastrado!");
        }

        return veiculos;
    }

}
package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class VeiculoService {

    private List<Veiculo> veiculos = new ArrayList<>();

    public Veiculo cadastrar(Veiculo veiculo) {
        veiculos.add(veiculo);

        return veiculo;
    }
}

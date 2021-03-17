package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.models.Servico;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ServicoService {

    private List<Servico> servicos = new ArrayList<>();

    public Servico cadatrar(Servico servico) {
        servicos.add(servico);
        return servico;
    }

}

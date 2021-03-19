package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.exceptions.ClienteDuplicadoExcecao;
import br.com.zup.gerenciadorDeOficina.models.Cliente;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    private List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente){
        if(!clientes.contains(cliente)){
            clientes.add(cliente);
            return cliente;
        }
        throw new ClienteDuplicadoExcecao("O CPF " + cliente.getCpf() + " e e-mail " + cliente.getEmail() +
                " cliente EXISTENTE!");
    }

    public Cliente pesquisarPeloCpf(String cpf) {
        for (Cliente cliente : clientes) {
            if (cliente.getCpf().equalsIgnoreCase(cpf)) {
                return cliente;
            }   
        }
        throw new ClienteDuplicadoExcecao("Nenhum cliente foi encontrado com CPF: " + cpf);
    }

}
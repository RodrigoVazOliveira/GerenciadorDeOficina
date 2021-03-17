package br.com.zup.gerenciadorDeOficina.services;

import br.com.zup.gerenciadorDeOficina.models.Cliente;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {
    private List<Cliente> clientes = new ArrayList<>();

    public Cliente cadastrarCliente(Cliente cliente){
        clientes.add(cliente);
        return cliente;
    }

}

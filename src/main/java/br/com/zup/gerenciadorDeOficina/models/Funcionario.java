package br.com.zup.gerenciadorDeOficina.models;

/**
 * Classe para definir os atributos do Funcionário.
 */

import java.time.LocalDate;

public class Funcionario {

    private String nomecompleto;
    private String cpf;
    private LocalDate dataNascimento;

    public Funcionario() {
    }

    public String getNomecompleto() {
        return nomecompleto;
    }

    public void setNomecompleto(String nomecompleto) {
        this.nomecompleto = nomecompleto;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
}

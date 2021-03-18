package br.com.zup.gerenciadorDeOficina.models;

/**
 * Classe para definir os atributos do Funcionário.
 */

import org.springframework.format.annotation.DateTimeFormat;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

public class Funcionario {


    @NotNull(message = "Nome incompleto ou digitado erroneamente")
    private String nomecompleto;
    @NotNull(message = "cpf não encontrado")
    private String cpf;
    @DateTimeFormat(pattern = "dd/MM/yyyy")
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
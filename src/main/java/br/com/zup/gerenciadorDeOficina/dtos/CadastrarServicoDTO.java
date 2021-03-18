package br.com.zup.gerenciadorDeOficina.dtos;

import br.com.zup.gerenciadorDeOficina.models.Funcionario;
import br.com.zup.gerenciadorDeOficina.models.Servico;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;
import br.com.zup.gerenciadorDeOficina.models.enums.Andamento;

import java.time.LocalDate;

public class CadastrarServicoDTO {

    private Integer ordemDeServico;
    private String chassi;
    private LocalDate dataDeEntrada;
    private LocalDate dataDeSaida;
    private String tipoDeServico;
    private Andamento andamento;
    private String cpfFuncionario;
    private String responsavelPeloServico;

    public CadastrarServicoDTO() {
    }

    public Integer getOrdemDeServico() {
        return ordemDeServico;
    }

    public void setOrdemDeServico(Integer ordemDeServico) {
        this.ordemDeServico = ordemDeServico;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public LocalDate getDataDeEntrada() {
        return dataDeEntrada;
    }

    public void setDataDeEntrada(LocalDate dataDeEntrada) {
        this.dataDeEntrada = dataDeEntrada;
    }

    public LocalDate getDataDeSaida() {
        return dataDeSaida;
    }

    public void setDataDeSaida(LocalDate dataDeSaida) {
        this.dataDeSaida = dataDeSaida;
    }

    public String getTipoDeServico() {
        return tipoDeServico;
    }

    public void setTipoDeServico(String tipoDeServico) {
        this.tipoDeServico = tipoDeServico;
    }

    public Andamento getAndamento() {
        return andamento;
    }

    public void setAndamento(Andamento andamento) {
        this.andamento = andamento;
    }

    public String getCpfFuncionario() {
        return cpfFuncionario;
    }

    public void setCpfFuncionario(String cpfFuncionario) {
        this.cpfFuncionario = cpfFuncionario;
    }

    public String getResponsavelPeloServico() {
        return responsavelPeloServico;
    }

    public void setResponsavelPeloServico(String responsavelPeloServico) {
        this.responsavelPeloServico = responsavelPeloServico;
    }

    public Servico converterCadastrarServicoDTOParaServico(Veiculo veiculo, Funcionario funcionario) {
        Servico servico = new Servico();
        servico.setOrdemDeServico(this.ordemDeServico);
        servico.setVeiculo(veiculo);
        servico.setDataDeEntrada(this.dataDeEntrada);
        servico.setDataDeSaida(this.dataDeSaida);
        servico.setTipoDeServico(this.tipoDeServico);
        servico.setAndamento(this.andamento);
        servico.setFuncionario(funcionario);
        servico.setResponsavelPeloServico(responsavelPeloServico);

        return servico;
    }
}

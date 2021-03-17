package br.com.zup.gerenciadorDeOficina.dtos;

import br.com.zup.gerenciadorDeOficina.models.Cliente;
import br.com.zup.gerenciadorDeOficina.models.Veiculo;

public class CadastrarVeiculoDTO {
    private String tipoDeVeiculo;
    private String marcaDoVeiculo;
    private String modeloDoVeiculo;
    private Integer anoDoVeiculo;
    private String placaDoVeiculo;
    private String chassi;
    private String cpfOuCnpj;

    public CadastrarVeiculoDTO() {
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public String getMarcaDoVeiculo() {
        return marcaDoVeiculo;
    }

    public void setMarcaDoVeiculo(String marcaDoVeiculo) {
        this.marcaDoVeiculo = marcaDoVeiculo;
    }

    public String getModeloDoVeiculo() {
        return modeloDoVeiculo;
    }

    public void setModeloDoVeiculo(String modeloDoVeiculo) {
        this.modeloDoVeiculo = modeloDoVeiculo;
    }

    public Integer getAnoDoVeiculo() {
        return anoDoVeiculo;
    }

    public void setAnoDoVeiculo(Integer anoDoVeiculo) {
        this.anoDoVeiculo = anoDoVeiculo;
    }

    public String getPlacaDoVeiculo() {
        return placaDoVeiculo;
    }

    public void setPlacaDoVeiculo(String placaDoVeiculo) {
        this.placaDoVeiculo = placaDoVeiculo;
    }

    public String getChassi() {
        return chassi;
    }

    public void setChassi(String chassi) {
        this.chassi = chassi;
    }

    public String getCpfOuCnpj() {
        return cpfOuCnpj;
    }

    public void setCpfOuCnpj(String cpfOuCnpj) {
        this.cpfOuCnpj = cpfOuCnpj;
    }

    public Veiculo converterCadastrarVeiculoDTOparaVeiculo(Cliente donoDoVeiculo) {
        Veiculo veiculo = new Veiculo();
        veiculo.setTipoDeVeiculo(this.tipoDeVeiculo);
        veiculo.setMarcaDoVeiculo(this.marcaDoVeiculo);
        veiculo.setAnoDoVeiculo(this.anoDoVeiculo);
        veiculo.setModeloDoVeiculo(this.modeloDoVeiculo);
        veiculo.setPlacaDoVeiculo(this.placaDoVeiculo);
        veiculo.setChassi(this.chassi);
        veiculo.setDonoDoVeiculo(donoDoVeiculo);

        return veiculo;
    }
}

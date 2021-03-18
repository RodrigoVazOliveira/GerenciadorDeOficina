package br.com.zup.gerenciadorDeOficina.models;

public class Veiculo {

    private String tipoDeVeiculo;
    private String marcaDoVeiculo;
    private String modeloDoVeiculo;
    private Integer anoDoVeiculo;
    private String placaDoVeiculo;
    private String chassi;
    private Cliente donoDoVeiculo;

    public Veiculo() {
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

    public Cliente getDonoDoVeiculo() {
        return donoDoVeiculo;
    }

    public void setDonoDoVeiculo(Cliente donoDoVeiculo) {
        this.donoDoVeiculo = donoDoVeiculo;
    }

}
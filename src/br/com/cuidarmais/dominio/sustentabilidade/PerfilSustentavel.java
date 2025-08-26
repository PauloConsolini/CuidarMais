package br.com.cuidarmais.dominio.sustentabilidade;

public class PerfilSustentavel {

    private double consumoEnergiaEstimado;
    private double carbonoEstimado;
    private double consumoDeAgua;

    public PerfilSustentavel(double consumoEnergiaEstimado, double carbonoEstimado, double consumoDeAgua) {
       
        this.consumoEnergiaEstimado = consumoEnergiaEstimado;
        this.carbonoEstimado = carbonoEstimado;
        this.consumoDeAgua = consumoDeAgua;
    }

    public double getConsumoEnergiaEstimado() {
        return consumoEnergiaEstimado;
    }

    public void setConsumoEnergiaEstimado(double consumoEnergiaEstimado) {
        this.consumoEnergiaEstimado = consumoEnergiaEstimado;
    }

    public double getCarbonoEstimado() {
        return carbonoEstimado;
    }

    public void setCarbonoEstimado(double carbonoEstimado) {
        this.carbonoEstimado = carbonoEstimado;
    }

    public double getConsumoDeAgua() {
        return consumoDeAgua;
    }

    public void setConsumoDeAgua(double consumoDeAgua) {
        this.consumoDeAgua = consumoDeAgua;
    }
}


package br.com.cuidarmais.dominio.seguros;

public class Cobertura {

    private String nome;
    private double valor;
    private NivelRisco nivelRisco;

    public Cobertura(String nome, double valor, NivelRisco nivelRisco) {
        this.nome = nome;
        this.valor = valor;
        this.nivelRisco = nivelRisco;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    public NivelRisco getNivelRisco() {
        return nivelRisco;
    }

    @Override
    public String toString() {
        return "Cobertura{" +
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", nivelRisco=" + nivelRisco +
                '}';
    }
}

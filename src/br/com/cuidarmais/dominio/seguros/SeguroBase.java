package br.com.cuidarmais.dominio.seguros;
import br.com.cuidarmais.dominio.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class SeguroBase implements ProdutoSeguro {

    protected Cliente cliente;
    protected double valorBase;
    protected List<Cobertura> coberturas;
    protected double riscoCalculado;
    protected double premioFinal;

    public SeguroBase(Cliente cliente, double valorBase) {
        this.cliente = cliente;
        this.valorBase = valorBase;
        this.coberturas = new ArrayList<>();
    }

    public void adicionarCobertura(Cobertura cobertura) {
        coberturas.add(cobertura);
    }

    public double calcularValorTotalCoberturas() {
        return coberturas.stream()
                .mapToDouble(Cobertura::getValor)  // método getValor() em Cobertura deve existir
                .sum();
    }

    public List<Cobertura> getCoberturasDeAltoRisco() {
        return coberturas.stream()
                .filter(c -> c.getNivelRisco() == NivelRisco.ALTO)  // método getNivelRisco() deve existir na Cobertura
                .collect(Collectors.toList());
    }

    // Métodos abstratos que devem ser implementados nas subclasses
    public abstract void calcularPremio();
    public abstract void avaliarRisco();

    // Getters e Setters, se necessário

    public Cliente getCliente() {
        return cliente;
    }

    public double getValorBase() {
        return valorBase;
    }

    public List<Cobertura> getCoberturas() {
        return coberturas;
    }

    public double getRiscoCalculado() {
        return riscoCalculado;
    }

}


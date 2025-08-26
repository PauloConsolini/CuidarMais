package br.com.cuidarmais.dominio.seguros;
import br.com.cuidarmais.dominio.clientes.Cliente;

public class SeguroVida extends SeguroBase {

    public SeguroVida(Cliente cliente, double valorBase) {
        super(cliente, valorBase);
    }

    @Override
    public void avaliarRisco() {
        int idade = cliente.getIdade();

        if (idade < 30) {
            this.riscoCalculado = 200.0;
        } else if (idade <= 49) {
            this.riscoCalculado = 350.0;
        } else {
            this.riscoCalculado = 600.0;
        }
    }

    @Override
    public void calcularPremio() {
        double valorCoberturas = coberturas.stream()
            .mapToDouble(Cobertura::getValor)
            .sum();

        double ajusteSustentavel = calcularAjustePerfilSustentavel();

        this.premioFinal = this.valorBase + this.riscoCalculado + valorCoberturas - ajusteSustentavel;

        System.out.println("Prêmio do Seguro Vida: R$ " + this.premioFinal);
    }

    private double calcularAjustePerfilSustentavel() {
        if (cliente.getPerfilSustentavel() == null) return 0.0;

        double indicador = cliente.getPerfilSustentavel().getCarbonoEstimado()
                + cliente.getPerfilSustentavel().getConsumoEnergiaEstimado()
                + cliente.getPerfilSustentavel().getConsumoDeAgua();

        if (indicador < 150) return 50.0;
        else if (indicador < 300) return 25.0;
        else return 0.0;
    }
}


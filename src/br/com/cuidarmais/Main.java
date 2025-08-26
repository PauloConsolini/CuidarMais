package br.com.cuidarmais;
import br.com.cuidarmais.dominio.canais.Canal;
import br.com.cuidarmais.dominio.clientes.Cliente;
import br.com.cuidarmais.dominio.clientes.TipoCliente;
import br.com.cuidarmais.dominio.seguros.Cobertura;
import br.com.cuidarmais.dominio.seguros.SeguroSaude;
import br.com.cuidarmais.dominio.seguros.NivelRisco;
import br.com.cuidarmais.dominio.comunicacao.EnviadorDeMensagens;
import br.com.cuidarmais.dominio.sustentabilidade.PerfilSustentavel;


public class Main {
    public static void main(String[] args) {

        // Criar cliente com perfil sustentável
        Cliente cliente = new Cliente(
                "João",
                "12345678900",
                45,
                TipoCliente.PESSOA_FISICA,
                Canal.WHATSAPP,
                new PerfilSustentavel(120, 40, 60)
        );

        // Criar seguro saúde com valor base
        SeguroSaude seguro = new SeguroSaude(cliente, 100.0);

        // Adicionar coberturas
        seguro.adicionarCobertura(new Cobertura("Cobertura básica", 50.0, NivelRisco.BAIXO));
        seguro.adicionarCobertura(new Cobertura("Cobertura extra", 75.0, NivelRisco.MEDIO));

        // Avaliar risco e calcular prêmio
        seguro.avaliarRisco();
        seguro.calcularPremio();

        // Notificar cliente com base no canal preferido
        EnviadorDeMensagens.notificarCliente(cliente, "Sua apólice de seguro saúde foi gerada com sucesso.");
        EnviadorDeMensagens.notificarCliente(cliente, "Obrigado por contribuir com a sustentabilidade!");

        System.out.println("FIM DO PROCESSO.");
    }
}

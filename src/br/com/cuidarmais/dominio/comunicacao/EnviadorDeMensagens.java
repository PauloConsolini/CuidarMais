package br.com.cuidarmais.dominio.comunicacao;
import br.com.cuidarmais.dominio.clientes.Cliente;
import br.com.cuidarmais.dominio.canais.Canal;

public class EnviadorDeMensagens {

    public static void notificarCliente(Cliente cliente, String mensagem) {
        Canal canalPreferido = cliente.getCanalPreferido();
        CanalComunicacao canalComunicacao;

        switch (canalPreferido) {
            case APP -> canalComunicacao = new AppComunicacao();
            case EMAIL -> canalComunicacao = new EmailComunicacao();
            case WHATSAPP -> canalComunicacao = new WhatsappComunicacao();
            default -> {
                System.out.println("Canal não suportado para " + cliente.getNome());
                return;
            }
        }

        canalComunicacao.enviarMensagem(cliente, mensagem);
    }
}


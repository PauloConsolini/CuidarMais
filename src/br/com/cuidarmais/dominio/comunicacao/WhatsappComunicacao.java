package br.com.cuidarmais.dominio.comunicacao;
import br.com.cuidarmais.dominio.clientes.Cliente;

public class WhatsappComunicacao implements CanalComunicacao {
   
    @Override
    public void enviarMensagem(Cliente cliente, String mensagem) {
        System.out.println("[WHATSAPP] Para " + cliente.getNome() + ": " + mensagem);
    
    }
    
}

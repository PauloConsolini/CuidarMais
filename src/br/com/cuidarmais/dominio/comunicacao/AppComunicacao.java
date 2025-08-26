package br.com.cuidarmais.dominio.comunicacao;
import br.com.cuidarmais.dominio.clientes.Cliente;

public class AppComunicacao implements CanalComunicacao {
    
    @Override
    public void enviarMensagem(Cliente cliente, String mensagem) {
        System.out.println("[APP] Para " + cliente.getNome() + ": " + mensagem);
    
    }

}


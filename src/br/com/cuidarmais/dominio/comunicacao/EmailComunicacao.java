package br.com.cuidarmais.dominio.comunicacao;
import br.com.cuidarmais.dominio.clientes.Cliente;

public class EmailComunicacao implements CanalComunicacao {
    
    @Override
    public void enviarMensagem(Cliente cliente, String mensagem) {
        System.out.println("[EMAIL] Para " + cliente.getNome() + ": " + mensagem);
    
    }
    
}



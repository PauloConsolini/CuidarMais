package br.com.cuidarmais.dominio.comunicacao;
import br.com.cuidarmais.dominio.clientes.Cliente;

public interface CanalComunicacao {

        void enviarMensagem(Cliente cliente, String mensagem);

}



package br.com.cuidarmais.dominio.clientes;
import br.com.cuidarmais.dominio.canais.Canal;
import br.com.cuidarmais.dominio.sustentabilidade.PerfilSustentavel;


public class Cliente {
    
    private String nome;
    private String documento;
    private int idade;
    private TipoCliente tipo;
    private Canal canalPreferido;
    private PerfilSustentavel perfilSustentavel;

    public Cliente(String nome, String documento, int idade, TipoCliente tipo, Canal canalPreferido, PerfilSustentavel perfilSustentavel) {
        this.nome = nome;
        this.documento = documento;
        this.idade = idade;
        this.tipo = tipo;
        this.canalPreferido = canalPreferido;
        this.perfilSustentavel = perfilSustentavel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public int getIdade() {
        return idade;
    }
    
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }

    public Canal getCanalPreferido() {
        return canalPreferido;
    }

    public void setCanalPreferido(Canal canalPreferido) {
        this.canalPreferido = canalPreferido;
    }

    public PerfilSustentavel getPerfilSustentavel() {
        return perfilSustentavel;
    }

    public void setPerfilSustentavel(PerfilSustentavel perfilSustentavel) 
        this.perfilSustentavel = perfilSustentavel;
    }


}



package POO.Enumeracao.dominio;

public class Cliente {
    //enumeração -> força a um tipo de valor ser sempre passado como parâmetro/atributo
     /*pode ser public private protected etc*/

    private String nome;
    protected final TipoCliente tipoCliente;
    public TipoPagamento tipoPagamento;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }


    @Override
    public String toString() {
        return "Cliente{" +
                "nome='" + nome + '\'' +
                ", tipoCliente=" + tipoCliente +
                ", tipoClienteNum=" + tipoCliente.valor +
                ", tipoClienteNomeRelatorio=" + tipoCliente.nomeRelatorio +
                ", tipoPagamento=" + tipoPagamento +
                '}';
    }

    public Cliente(String nome, TipoCliente tipoCliente, TipoPagamento tipoPagamento) {
        this.nome = nome;
        this.tipoCliente = tipoCliente;
        this.tipoPagamento = tipoPagamento;
    }
}

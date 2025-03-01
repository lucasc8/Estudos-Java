package POO.Enumeracao.dominio;

public enum TipoCliente {
    PESSOA_FISICA(1,"Pessoa Fisica"), //->objetos sendo inicializados
    PESSOA_JURIDICA(2,"Pessoa Juridica");

    public final int valor;  //atributos dos objetos do tipo TipoCliente(enum)
    public final String nomeRelatorio;

    //construtor dos objetos com seus parâmetros
    TipoCliente(int valor, String nomeRelatorio) {
        this.valor = valor;
        this.nomeRelatorio = nomeRelatorio;
    }








}

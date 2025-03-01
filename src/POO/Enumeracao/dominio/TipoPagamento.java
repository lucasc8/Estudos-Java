package POO.Enumeracao.dominio;

public enum TipoPagamento {
    DEBITO(1){
        @Override
        public double calcularDesconto(double valor){
            return 0.1 * valor;
        }
    },
    CREDITO(2){
        @Override
        public double calcularDesconto(double valor){
            return 0.2*valor;
        }
    };


    public final int codigos;
    TipoPagamento(int inteiro){
        this.codigos = inteiro;
    }

    public abstract double calcularDesconto(double valor);
    /*public double calcularDesconto(double valor){
        return 0;
    }*/
    //-> nesses casos usamos abstrações quando sobscrevemos esse método
}

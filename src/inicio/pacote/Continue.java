package inicio.pacote;

public class Continue {
    public static void main(String[] args) {

        double valorTotal = 30000;
        int valorMinParcela = 1000;

        for (int numParcela = 1; numParcela <= valorTotal ; numParcela++) {
            double valorParcela = valorTotal/numParcela;
            if (valorParcela < valorMinParcela){
                continue;
            }
                System.out.println(numParcela + " - " + valorParcela);
        }
    }
}

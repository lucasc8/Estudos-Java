package inicio.pacote;

public class Exericio5Break {
    public static void main(String[] args) {
        //em quantas vezes um carro pode ser parcelado -> 50.000
        //valor minimo = 1000

        double valorTotal = 50000;
        int valorMinParcela = 1000;
        for (int numParcela = 1; numParcela <= valorTotal ; numParcela++) {
            double valorParcela = valorTotal/numParcela;
            if (valorParcela >= valorMinParcela){
                System.out.println(numParcela + " - " + valorParcela);
            }
        }
    }
}

package POO.Polimorfismo.teste;

import POO.Polimorfismo.Servico.CalculadoraImposto;
import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Televisao;
import POO.Polimorfismo.dominio.Tomate;

public class ProdutoTeste {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsumg", 1000);
        Tomate tomate = new Tomate("Vermelho", 1000);
        CalculadoraImposto.calcularImpostoComputador(computador);
        System.out.println("---------------------------------------");
        CalculadoraImposto.calcularImpostoTomate(tomate);
        Televisao tv = new Televisao("Saumsung 1500\" ", 1300);
        CalculadoraImposto.calcularImpostoProduto(tv); // funciona pq tv (extends) é -> produto



    }
}

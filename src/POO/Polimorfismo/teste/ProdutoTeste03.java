package POO.Polimorfismo.teste;

import POO.Polimorfismo.Servico.CalculadoraImposto;
import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;

public class ProdutoTeste03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Ryzen2000", 1500);
        Tomate tomate1 = new Tomate("Tomatevermei",12);
        tomate1.setDataValidade("12/11/2021");

        CalculadoraImposto.calcularImpostoProduto(tomate1);
        CalculadoraImposto.calcularImpostoProduto(computador);















    }
}

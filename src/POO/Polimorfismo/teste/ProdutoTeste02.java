package POO.Polimorfismo.teste;

import POO.Polimorfismo.Servico.CalculadoraImposto;
import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;

public class ProdutoTeste02 {
    public static void main(String[] args) {
        //Widening Casting
        //um tipo generico fazendo referencia a um tipo mais especifico
        // o tipo generico tem menos métodos etc

        Produto produto = new Computador("Ryzen2000", 1500);
        System.out.println(produto.getNome());
        System.out.println(produto.getValor());
        System.out.println(produto.calcularImposto(produto.getValor()));
        System.out.println("--------------------");

        Produto produto2 = new Tomate("Africano", 20);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto(produto2.getValor()));
        System.out.println("fim do teste 1");
        // produto2.getDataValidade -> não da pra utilizar esse método
        // não tem na variavel, so no objeto
        System.out.println("--------------");
        System.out.println("Começo calculadora");
        CalculadoraImposto.calcularImpostoProduto(produto);
        System.out.println("Fim do produto 1");
        CalculadoraImposto.calcularImpostoProduto(produto2);
        System.out.println("Fim do produto 2");
    }
}

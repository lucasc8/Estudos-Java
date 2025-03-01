package POO.Polimorfismo.Servico;

import POO.Polimorfismo.dominio.Computador;
import POO.Polimorfismo.dominio.Produto;
import POO.Polimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatorio do Computador");
        System.out.println("------------------------");
        System.out.println("Nome: "+computador.getNome());
        System.out.println("Valor: "+computador.getValor());
        double valorComputador = computador.getValor();
        double imposto = computador.calcularImposto(valorComputador);
        System.out.println("Imposto: "+imposto);
        double valorTotal = imposto + valorComputador;
        System.out.println("Valor total: "+valorTotal);
    }
    public static void calcularImpostoTomate(Tomate tomate1){
        System.out.println("Relatorio do Tomate");
        System.out.println("------------------------");
        System.out.println("Nome: "+tomate1.getNome());
        System.out.println("Valor: "+tomate1.getValor());
        double valorTomate = tomate1.getValor();
        double imposto = tomate1.calcularImposto(valorTomate);
        System.out.println("Imposto: "+imposto);
        double valorTotal = imposto + valorTomate;
        System.out.println("Valor total: "+valorTotal);
    }
    public static void calcularImpostoProduto(Produto produto){
        System.out.println("Relatorio do Produto");
        produto.calcularImposto(produto.getValor());
        System.out.println("------------------------");
        System.out.println("Nome; "+ produto.getNome());
        System.out.println("Valor: "+produto.getValor());
        double valorProduto = produto.getValor();
        double imposto = produto.calcularImposto(produto.getValor());
        System.out.println("Imposto: "+imposto);
        double valorTotal = imposto + valorProduto;
        System.out.println("Valor Total: "+valorTotal);
        if (produto instanceof Tomate){ //se a variavel referenciando produto for uma instancia da classe Tomate
            Tomate tomate = (Tomate) produto; // produto = Tomate // -> cast (explicito)
            System.out.println(tomate.getDataValidade());
        }
    }
}

package POO.ModificadorFinal.teste;

import POO.ModificadorFinal.dominio.Carro;
import POO.ModificadorFinal.dominio.Comprador;

public class ModificadorFinalTeste
    {
        public static void main(String[] args) {
            Carro carro1 = new Carro("A");

            System.out.println(Carro.VELOCIDADE_LIMITE);

            System.out.println("-----");
            Comprador comprador2 = new Comprador();

            //carro1.COMPRADOR = comprador2; // nao pode

            carro1.COMPRADOR.setNome("Jesus");
            System.out.println(carro1.COMPRADOR.getNome());
            comprador2.setNome("a");
            //Ferrari ferrari = new Ferrari();
            //ferrari.setNome("Ferrari daora vermelha vruum");
            //ferrari.imprimir();

        }
}

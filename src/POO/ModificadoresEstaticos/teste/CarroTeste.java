package POO.ModificadoresEstaticos.teste;

import POO.ModificadoresEstaticos.dominio.Carro;

public class CarroTeste {
    public static void main(String[] args) {
        System.out.println("-----------------");
        Carro carro1 = new Carro("UNO", 250);
        //velocidade dos obj da classe = 270
        carro1.imprimir();

        System.out.println("-----------------");

        Carro carro2 = new Carro("PÁLIO", 280);
        // Carro.velocidadeLimite = 230;
        carro2.imprimir();

        System.out.println("-----------------");

        Carro.setVelocidadeLimite(280);
        Carro carro3 = new Carro("BMW",200);
        carro3.imprimir();

        System.out.println("-----------------");
        System.out.println("A velocidade limite dos carros é: "+Carro.getVelocidadeLimite());
    }
}

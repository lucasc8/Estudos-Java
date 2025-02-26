package POO.Associacao.teste;

import POO.Associacao.dominio.Jogador;

import java.util.Arrays;

public class JogadorTeste {

    public static void main(String[] args) {

        Jogador jogador0 = new Jogador("Pedro");
        Jogador jogador1 = new Jogador("Joao");
        Jogador jogador2 = new Jogador("Carlo");
        Jogador[] jogadore = new Jogador[3];
        Jogador[] jogadores = {jogador0,jogador1};
        Jogador[] jogadoresas = new Jogador[]{jogador2};

//        System.out.println(Arrays.toString(jogadoresas));

        System.out.println("-------------------");

//        // Jogador jogador -> recebe -> nomes de jogadores
//        for (Jogador jogador: jogadores){
//            jogador.imprime();
//        }
    }
}

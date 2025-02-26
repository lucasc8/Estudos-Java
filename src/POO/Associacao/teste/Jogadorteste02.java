package POO.Associacao.teste;

import POO.Associacao.dominio.Jogador;
import POO.Associacao.dominio.Time;

public class Jogadorteste02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Jao");
        Time time1 = new Time("Flamengo");
        jogador1.setTime(time1);
        jogador1.imprime();



    }
}

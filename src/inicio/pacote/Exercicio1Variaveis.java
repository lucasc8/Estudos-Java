package inicio.pacote;

public class Exercicio1Variaveis {
    // exericio: eu <nome>, morando no endereco <endereco>, confirmo que recebi o salario de <valor>, na data <data>
    public static void main(String[] args) {
        String nome = "Lucas";
        String endereco = "Rua alvares de cabral num 10";
        int salario = 1000;
        String data = "03/10/2023";
        String relatorio = "Eu, " + nome + ", confirmo que recebi o salário de " + salario + ", no endereco "+ endereco + ", na data de " + data + ".";
        System.out.println(relatorio);
    }
}


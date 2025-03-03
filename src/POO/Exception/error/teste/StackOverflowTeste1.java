package POO.Exception.error.teste;

public class StackOverflowTeste1 {
    public static void recursividade(){
        recursividade();
    }
    public static void main(String[] args) {
        recursividade();
    }
}

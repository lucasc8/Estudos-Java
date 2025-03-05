package POO.Exception.runtime.teste;

public class RuntimeExceptionTeste {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("FALA GLR");
    }
    private static int divisao(int a,int b) {
        if (b == 0){
            throw new IllegalArgumentException("argumento ilegal, b nao pode ser 0");
        }
        return a/b;
    }
}

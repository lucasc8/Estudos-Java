package POO.Exception.ExceptionTeste;

public class RuntimeException2 {
    /*
    @trows
     */
    public static int divisao(int a, int b){
        if (b == 0){
            throw new IllegalArgumentException("Argumento Ilegal, não pode ser 0");
        } // codigo abaixo n é executado por conta do throw
        return a/b;
    }
    //IllegalArgumentException -> filha de RuntimeException
    //sempre bom usa as exceções mais específicas possiveis

    public static void main(String[] args) {
        System.out.println(divisao(1,3));
    }
}

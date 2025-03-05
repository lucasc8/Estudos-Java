package POO.Exception.runtime.teste;

public class RuntimeExceptionTeste2 {
    public static void main(String[] args) {
        divisao(1,0);
        System.out.println("aoei");
    }

    /**
     *
     * @param a
     * @param b divisor nao pode sr 0
     * @return throws IllegalArgumentException
     */

    public static int divisao(int a,int b){
        try{
            return a/b;
        }catch(ArithmeticException e){
            e.printStackTrace();
        }
        return 0;
    }




}

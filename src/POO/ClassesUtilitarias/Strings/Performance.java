package POO.ClassesUtilitarias.Strings;

public class Performance {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis(); // ms
        concatString(100_000);
        long fim = System.currentTimeMillis(); // ms
        System.out.println("Tempo gasto para concatenaçã das strings: " + (fim - inicio) + "ms");
        inicio = System.currentTimeMillis(); // ms
        concatStringBuilder(100_000);
        System.out.println("Tempo gasto para concatenaçã das strings com SB: " + (fim - inicio) + "ms");
        fim = System.currentTimeMillis(); // ms
        concatStringerBuffer(100_000);
        inicio = System.currentTimeMillis(); // ms
        System.out.println("Tempo gasto para concatenaçã das strings com SBuffer: " + (fim - inicio) + "ms");
        fim = System.currentTimeMillis(); // ms
    }

    public static void concatString(int tamanho){
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    public static void concatStringBuilder(int tamanho){
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    public static void concatStringerBuffer(int tamanho){
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }




}

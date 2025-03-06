package POO.ClassesUtilitarias.Strings;

public class StringBuilderTeste1 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder(16);
        String nome = new String("Fernando");

        sb.append("Ola ").append(nome);
        sb.delete(0,1);
        System.out.println(sb);
        nome.concat("DevDojo");
        System.out.println(nome);



    }
}

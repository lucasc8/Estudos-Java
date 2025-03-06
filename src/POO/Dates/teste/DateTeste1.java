package POO.Dates.teste;

import java.util.Date;

public class DateTeste1 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000L); // long representando os milissigundos
        System.out.println(date);

        System.out.println(date.getTime()); // representa o dia de hoje

    }
}

package inicio.pacote;

public class Arrays {
    public static void main(String[] args) {

        int[] idades = new int [3];
        idades[0] = 10;
        idades[1] = 20;
        idades[2] = 30;

        String[] nomes = new String [3];
        nomes[0] = "Vanderlei";
        nomes[1] = "joelma";
        nomes[2] = "euvictoreu";
        for (int i = 0; i < nomes.length ; i++) {
            System.out.println(nomes[i]);
        }
        int[] inteiros = {1,3,4,5};
        System.out.println(inteiros[0]);

        for(int num: inteiros){
            System.out.println(num);
        }


    }
}

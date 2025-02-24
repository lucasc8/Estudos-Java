package inicio.pacote;

public class ArraysMultidimensionais {
    public static void main(String[] args){

        System.out.println("------------------------------------------------");

        int[] unidade = {1,4,2,3};
        for(int num : unidade){
            System.out.println(num);
        }

        System.out.println("------------------------------------------------");

        //mes 1 3 4 10 12
        //dia 4 21 43 22 12
        int[][] dias = new int[3][3];

        dias[0][0] = 10;
        dias[0][1] = 20;
        dias[0][2] = 30;
        dias[1][0] = 40;
        dias[1][1] = 50;
        dias[1][2] = 60;
        dias[2][0] = 70;
        dias[2][1] = 80;
        dias[2][2] = 90;

        for(int i = 0; i < dias.length; i++){
            for(int e = 0; e < dias[i].length; e++){
                System.out.println("Número: "+dias[i][e]);
            }
        }

        System.out.println("------------------------------------------------");

        //       int[][] dias = new int[3][3];
        // foreach array simples -> int num referenciava valores de INTEIRO
        // foreach aray multi -> int[] num referencia valors de dias

        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }






    }
}

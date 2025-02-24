package inicio.pacote;

class ArraysMultidimensionais2 {
    public static void main(String[] args){
        int[] arrayz = {1,6,7,8,3};
        int[][] arrayInt = new int[3][];
        // pra ter algum valor tem que relacionar cada casa do array a um outro array
        arrayInt[0] = new int[2]; //array n1 -. relacionado a um array duplo
        arrayInt[1] = new int[]{1,3,4};
        arrayInt[2] = arrayz;


        for(int[] arrayBase : arrayInt){
            System.out.println("\n------");
            for(int num : arrayBase){
                System.out.print(num+" ");
            }
        }

        int[][] arrayInt2 = {{1,2,3}, {1,2,3},{1,4,5,6}}
    }
}
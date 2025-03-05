package POO.Exception.Finally;

public class Finally {
    public static void main(String[] args) {
        criarConexao();
    }
    private static String criarConexao(){
        try{
            System.out.println("Abrindo arquivo");
            System.out.println("Escrevendo");
            return "conexao aberta";
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            System.out.println("Fechando recurso aberto pelo SO");
        }
        return null;
    }
}

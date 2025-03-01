package POO.Interface.dominio;

public class DatabaseLoader implements DataLoader, DataRemover{
    @Override
    public void load() {
        System.out.println("carregando dados do banco de dados");
    }

    @Override
    public void remove() {
        System.out.println("removendo dados do banco de dados");
    }

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da base DatabaseLoader");
    }


}

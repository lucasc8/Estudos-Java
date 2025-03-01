package POO.Interface.dominio;
// interface é um contrato, pique abstract
//todos os métodos sao public e abstract

// diferente de herança, que nao pode extnder mais de uma classe, pode-se
//implmeentar mais de uma interface em uma classe

public interface DataLoader {
    //public abstract void load();
      void load();

      default void checkPermission(){
          System.out.println("fazendo checagem de permissão");
      } // -> nao precisa ser adicionado em todos os objetos // nao é abstração
    // porem o método fica disponivel para todas as classes

    //todos os atributos são public static final
    public static final int amem = 10;
    int amem2 = 10;

    public static void retrieveMaxDataSize(){
        System.out.println("Dentro da interface DataLoader");
    } // -> métodos static nao se sobscrevem



}


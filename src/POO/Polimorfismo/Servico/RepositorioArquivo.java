package POO.Polimorfismo.Servico;

import POO.Polimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvando nos arquivos");
    }
}

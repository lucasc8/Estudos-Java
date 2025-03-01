package POO.Polimorfismo.teste;

import POO.Polimorfismo.Servico.RepositorioArquivo;
import POO.Polimorfismo.Servico.RepositorioBancodeDados;
import POO.Polimorfismo.Servico.RepositorioMemoria;
import POO.Polimorfismo.repositorio.Repositorio;
public class RepositorioTeste {
public static void main(String[] args) {

        RepositorioBancodeDados repositorioBancodeDados = new RepositorioBancodeDados();
        repositorioBancodeDados.salvar();

        Repositorio repositorio = new RepositorioArquivo();
        Repositorio repositorio1 = new RepositorioBancodeDados();
        Repositorio repositorio2 = new RepositorioMemoria();
        repositorio.salvar();
        repositorio1.salvar();
        repositorio2.salvar();

    }
}


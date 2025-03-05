package POO.Exception.TryWithResources.dominio;

import java.io.Closeable;
import java.io.IOException;

public class Leitor1 implements Closeable {

    @Override
    public void close() throws IOException {
        System.out.println("leitor 1 fechado");
    }
}

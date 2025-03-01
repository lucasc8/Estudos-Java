package POO.Enumeracao.teste;

import POO.Enumeracao.dominio.Cliente;
import POO.Enumeracao.dominio.TipoCliente;
import POO.Enumeracao.dominio.TipoPagamento;

public class ClienteTeste {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Jao", TipoCliente.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente cliente2 = new Cliente("Luca", TipoCliente.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(cliente1);
        System.out.println(cliente2);
        //System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(cliente1.tipoPagamento.calcularDesconto(100));
        System.out.println(cliente1.tipoPagamento.calcularDesconto(400));
        System.out.println("----------------------------------");
        System.out.println(TipoCliente.valueOf("PESSOA_FISICA"));
        System.out.println(cliente1.getTipoCliente());
    }
}

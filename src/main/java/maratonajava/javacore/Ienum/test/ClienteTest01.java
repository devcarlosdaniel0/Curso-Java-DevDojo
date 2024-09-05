package academy.devdojo.maratonajava.javacore.Ienum.test;

import academy.devdojo.maratonajava.javacore.Ienum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoCliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoPagamento;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Thiago", TipoCliente.PESSOA_FISICA, TipoPagamento.CREDITO);
        Cliente cliente2 = new Cliente("Matheus", TipoCliente.PESSOA_JURIDICA, TipoPagamento.DEBITO);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());

        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));

        TipoCliente tipoCliente = TipoCliente.tipoClientePorNomeRelatorio("Pessoa Física");
        System.out.println(tipoCliente);
    }
}

package academy.devdojo.maratonajava.javacore.Ienum.test;

import academy.devdojo.maratonajava.javacore.Ienum.dominio.Cliente;
import academy.devdojo.maratonajava.javacore.Ienum.dominio.TipoCliente;

public class ClienteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("Thiago", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("Matheus", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1.toString());
        System.out.println(cliente2.toString());
    }
}

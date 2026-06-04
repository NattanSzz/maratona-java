package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Client;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.Client.PaymentType;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClientType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Salamanca", ClientType.PESSOA_FISICA, PaymentType.DEBITO);
        Client client2 = new Client("Fring", ClientType.PESSOA_JURIDICA, PaymentType.CREDITO);
        System.out.println(client1);
        System.out.println(client2);
    }
}

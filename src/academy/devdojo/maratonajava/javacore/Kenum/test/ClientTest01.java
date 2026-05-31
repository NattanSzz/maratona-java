package academy.devdojo.maratonajava.javacore.Kenum.test;

import academy.devdojo.maratonajava.javacore.Kenum.dominio.Client;
import academy.devdojo.maratonajava.javacore.Kenum.dominio.ClientType;

public class ClientTest01 {
    public static void main(String[] args) {
        Client client1 = new Client("Salamanca", ClientType.PESSOA_FISICA);
        Client client2 = new Client("Salamanca", ClientType.PESSOA_JURIDICA);
        Client client3 = new Client("Salamanca", ClientType.PESSOA_FISICA);
        Client client4 = new Client("Salamanca", ClientType.PESSOA_JURIDICA);
        System.out.println(client1);
        System.out.println(client2);
        System.out.println(client3);
        System.out.println(client4);
    }
}

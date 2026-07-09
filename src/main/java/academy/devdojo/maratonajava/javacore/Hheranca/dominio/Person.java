package academy.devdojo.maratonajava.javacore.Hheranca.dominio;

public class Person {
    protected String name;
    protected String cpf;
    protected Address address;

    static {
        System.out.println("Dentro do bloco de inicialização static de Person");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Person");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Person 2");
    }

    public Person(String name) {
        System.out.println("Dentro do construtor Person");
        this.name = name;
    }

    public void print() {
        System.out.println("Pessoa");
        System.out.println("----------------");
        System.out.println("Nome: " + this.name);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Endereço: " + this.address.getStreet());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
    
}

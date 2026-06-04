package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public enum ClientType {
    PESSOA_FISICA(1, "Pessoa Física"),
    PESSOA_JURIDICA(2, "Pessoa Juridica");

    private final int VALUE;
    private final String NAME;

    ClientType(int value, String name) {
        this.VALUE = value;
        this.NAME = name;
    }

    public int getValue() {
        return VALUE;
    }
    
    public String getName() {
        return NAME;
    }

}

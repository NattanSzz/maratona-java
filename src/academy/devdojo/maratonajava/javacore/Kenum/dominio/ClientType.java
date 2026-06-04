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

    public static ClientType typeByName(String name) {
        for(ClientType type : values()) {
            if(type.getName().equals(name)) {
                return type;
            }
        }
        return null;
    }

    public int getValue() {
        return VALUE;
    }
    
    public String getName() {
        return NAME;
    }

}

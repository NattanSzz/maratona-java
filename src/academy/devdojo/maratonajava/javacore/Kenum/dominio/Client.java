package academy.devdojo.maratonajava.javacore.Kenum.dominio;

public class Client {
    public enum PaymentType {
        DEBITO, CREDITO
    }

    private String name;
    private ClientType clientType;
    private PaymentType paymentType;

    public Client(String name, ClientType type, PaymentType pagmentType) {
        this.name = name;
        this.clientType = type;
        this.paymentType = pagmentType;
    }

    @Override
    public String toString() {
        return "Client [name=" + name + ", clientType=" + clientType.getName() +  ", clientTypeInt=" + clientType.getValue() + ", paymentType=" + paymentType + "]";
    }
    






    // private String type;
    // public static final String PESSOA_FISICA = "PESSOA_FISICA";
    // public static final String PESSOA_JURIDICA = "PESSOA_JURIDICA";
    
    // public Client(String name, String type) {
    //     if(!type.equals(PESSOA_FISICA) && !type.equals(PESSOA_JURIDICA)) return;
    //     this.name = name;
    //     this.type = type;
    // }

    // @Override
    // public String toString() {
    //     return "Client [name=" + name + ", type=" + type + "]";
    // }

    // public String getName() {
    //     return name;
    // }

    // public void setName(String name) {
    //     this.name = name;
    // }

    // public String getType() {
    //     return type;
    // }

    // public void setType(String type) {
    //     this.type = type;
    // }

    
}

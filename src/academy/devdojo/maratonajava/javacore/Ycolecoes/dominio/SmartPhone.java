package academy.devdojo.maratonajava.javacore.Ycolecoes.dominio;

public class SmartPhone {
    private String serialNumber;
    private String brand;

    public SmartPhone(String serialNumber, String brand) {
        this.serialNumber = serialNumber;
        this.brand = brand;
    }

    // reflexivo: x.equals(x) tem que ser true para tudo que for diferente de null 
    // simetrico: para x e y diferentes de null, se x.equals(y) == true logo, y.equals(x) == true
    // transitividade: para x, y, z diferentes de null, se x.equals(y) == true, e x.equals(z) == true, logo y.equals(z) == true
    // consistente: x.equals(x) sempre retorna true se x for diferente de null
    // para x diferente de null, x.equals(null) deve retornar false
    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(this == obj) return true;
        if(this.getClass() != obj.getClass()) return false;
        SmartPhone smartPhone = (SmartPhone) obj;
        return serialNumber != null && serialNumber.equals(smartPhone.serialNumber);
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    

}

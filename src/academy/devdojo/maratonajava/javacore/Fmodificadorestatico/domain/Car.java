package academy.devdojo.maratonajava.javacore.Fmodificadorestatico.domain;

public class Car {
    private String name;
    private double maxVelocity;
    public static double limitVelocity = 250;

    public Car(String name, double maxVelocity) {
        this.name = name;
        this.maxVelocity = maxVelocity;
    }

    public void print() {
        System.out.println("----------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Velocidade Maxima: " + this.maxVelocity);
        System.out.println("Limite de velocidade: " + Car.limitVelocity);
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getMaxVelocity() {
        return this.maxVelocity;
    }

    public void setMaxVelocity(double maxVelocity) {
        this.maxVelocity = maxVelocity;
    }

    public double getLimitVelocity() {
        return limitVelocity;
    }

    public void setLimitVelocity(double limitVelocity) {
        this.limitVelocity = limitVelocity;
    }
}

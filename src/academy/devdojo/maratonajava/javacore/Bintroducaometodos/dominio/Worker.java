package academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio;

public class Worker {
    public String name;
    public int age;
    public double[] wage;

    public void print() {
        System.out.println("---------------------------------------");
        System.out.println("Fucionário");
        System.out.println("---------------------------------------");
        System.out.println("Nome: " + this.name);
        System.out.println("Idade: " + this.age);
        System.out.print("Salários: ");
        if(this.wage != null) {
            for (double w : this.wage) {
                System.out.print(" - R$ " + w);
            }
        }
        System.out.printf("%n---------------------------------------%n");
    }

    public void wageAverage() {
        double average = 0;
        if(this.wage != null) {
            for(double v : this.wage) {
                average += v;
            }
            average /= this.wage.length;
        }
        System.out.println("A média dos salarios de " + this.name + " é R$ " + average);
    }
}

package academy.devdojo.maratonajava.javacore.Zgenerics.test;

public class WildcarTest01 {
    public static void main(String[] args) {
        Dog[] dogs = {new Dog(), new Dog()};
        Cat[] cats = {new Cat(), new Cat()};
        printConsulta(dogs);
        printConsulta(cats);
    }

    private static void printConsulta(Animal[] animals) {
        for(Animal animal : animals) {
            animal.consulta();
        }
    }
}

abstract class Animal {
public abstract void consulta();
}

class Dog extends Animal {

@Override
public void consulta() {
System.out.println("Consultando o dog");
}

}

class Cat extends Animal {

@Override
public void consulta() {
System.out.println("Consultando o cat");
}

}

package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repository;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.RepositoryDatabase;

public class RepositoryTest01 {
    public static void main(String[] args) {
        Repository repository = new RepositoryDatabase();
        repository.save();
    }
}

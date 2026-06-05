package academy.devdojo.maratonajava.javacore.Npolimorfismo.servico;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.repositorio.Repository;

public class RepositoryDatabase implements Repository{

    @Override
    public void save() {
        System.out.println("Salvando em um banco de dados");     
    }

}

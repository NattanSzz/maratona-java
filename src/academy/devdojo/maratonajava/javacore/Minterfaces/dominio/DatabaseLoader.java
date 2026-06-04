package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class DatabaseLoader implements DataLoader, DataRemove {
    public void load() {
        System.out.println("Carregando dados...");
    }

    public void remove() {
        System.out.println("Removendo do banco de dados...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Fazendo checagens de permissões do banco de dados");
    }
}

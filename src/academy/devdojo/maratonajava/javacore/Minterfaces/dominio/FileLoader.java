package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemove {
    public void load() {
        System.out.println("Carregando dados de um arquivo...");
    }

    public void remove() {
        System.out.println("Removendo dados de um arquivo...");
    }

    @Override
    public void checkPermissions() {
        System.out.println("Fazendo checagens de permissões no arquivo ");
    }
}

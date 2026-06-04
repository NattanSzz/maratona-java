package academy.devdojo.maratonajava.javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();
    
    default void checkPermissions() {
        System.out.println("Fazendo checagens de permissões");
    }
}
